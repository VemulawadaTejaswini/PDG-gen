import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	Map<Integer, List<Integer>> root = new HashMap<>();
    	for(int i = 0; i < m; i++) {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
    		List<Integer> list = root.get(a);
    		if(list == null) {
    			list = new ArrayList<>();
    			root.put(a,list);
    		}
    		list.add(b);
    		list = root.get(b);
    		if(list == null) {
    			list = new ArrayList<>();
    			root.put(b,list);
    		}
    		list.add(a);
    	}
    	Set<Integer> checkedSet = new HashSet<>();
    	checkedSet.add(1);
    	int[] michi = new int[n - 1];
    	List<Integer> nextCheck = new ArrayList<>();
    	nextCheck.add(1);
    	while(!nextCheck.isEmpty()) {
    		List<Integer> next = new ArrayList<>();
    		for(Integer checking : nextCheck) {
    			List<Integer> toList = root.get(checking);
    			for(Integer to : toList) {
    				if(checkedSet.contains(to)){
    					continue;
    				}
    				michi[to - 2] = checking;
    				checkedSet.add(to);
    				next.add(to);
    			}
    		}
    		nextCheck = next;
    	}
    	System.out.println("Yes");
    	for(int i : michi) {
    		System.out.println(i);
    	}
    }
}