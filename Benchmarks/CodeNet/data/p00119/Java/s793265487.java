import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
    
public class Main {
    public static void main(String[] args) {
        (new Main()).execute();
    }
    private void execute() {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        ObsessionComparator comp = new ObsessionComparator(m);
        for(int i = 0 ; i < n ; i++) {comp.add(sc.nextInt(), sc.nextInt());}
        
        Integer[] list = new Integer[m];
        for(int i = 0 ; i < m ; i++) {list[i] = Integer.valueOf(i+1);}
        
        Arrays.sort(list, comp);
        
        for(Integer i : list){System.out.println(i.toString());}
        sc.close();
    }
    
    private class ObsessionComparator implements Comparator<Integer> {
    	private Integer LAST_NUM = new Integer(2);
    	private Map<Integer, Set<Integer>> sortMap = new HashMap<Integer, Set<Integer>>();
    	private ObsessionComparator(int count) {
    		for(int i = 1 ; i <= count ; i++) {
    			sortMap.put(Integer.valueOf(i), new HashSet<Integer>());
    		}
    	}

    	private void add(Integer x, Integer y) {
    		sortMap.get(x).add(y);
    	}
    	private boolean isSorted(Integer x, Integer y) {
    		if(sortMap.get(x).contains(y)) {
    			return true;
    		} else if(sortMap.get(x).isEmpty()) {
    			return false;
    		} else {
    			for(Integer next : sortMap.get(x)) {
    				if(isSorted(next, y)){
    					sortMap.get(x).add(y);
    					return true;
    				}
    			}
    			return false;
    		}
    	}
    	
    	@Override
		public int compare(Integer arg0, Integer arg1) {
    		if(LAST_NUM.equals(arg0)){return 1;}
    		if(LAST_NUM.equals(arg1)){return -1;}
    		
    		if(isSorted(arg0, arg1)) {
    			return -1;
    		} else {
    			return 1;
    		}
		}
    }
}