import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = 0;
        int m = 0;
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        String line = cin.nextLine();
	        
	        if(i == 0) {
	            String[] nm = line.split(" ", 0);
	            n = Integer.parseInt(nm[0]);
	            m = Integer.parseInt(nm[1]);
	            
	        } else if(i == 1) {
	            String[] _x = line.split(" ", 0);
	            
	            for(int j = 0; j < _x.length; j++) {
	                x.add(Integer.parseInt(_x[j]));
	                
	            }
	            
	        } else {
	            
	        }
	        
        }
        
        if(n >= m) {
            System.out.println(0);
            return;
        }
        
        x.sort(Comparator.naturalOrder());
        
        ArrayList<Integer> d = new ArrayList<Integer>();
        
        for(int i = 1; i < x.size(); i++) {
            d.add(x.get(i) - x.get(i - 1));
            
        }
        
        ArrayList<Integer> _d = (ArrayList<Integer>)d.clone();
        int pmasu = -1;
        int cmasu = 0;
        int res = 0;
        
        _d.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < n; i++) {
            cmasu = d.indexOf(_d.get(i));
            res += x.get(cmasu) - x.get(pmasu  + 1);
            pmasu = cmasu;
            
        }
        
        res += x.get(x.size() - 1) - x.get(pmasu);
        
        System.out.println(res);
        
    }
    
}
