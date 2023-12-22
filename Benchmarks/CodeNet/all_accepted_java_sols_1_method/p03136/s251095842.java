import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = 0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        String line = cin.nextLine();
	        
	        if(i == 0) {
	            n = Integer.parseInt(line);
	            
	        } else if(i == 1) {
	            String[] _l = line.split(" ", 0);
	            
	            for(int j = 0; j < _l.length; j++) {
	                l.add(Integer.parseInt(_l[j]));
	                
	            }
	            
	        } else {
	            
	        }
	        
        }
        
        l.sort(Comparator.reverseOrder());
        
        int max = l.get(0);
        int sum = 0;
        
        for(int i = 1; i < l.size(); i++) {
            sum += l.get(i);
            
        }
        
        String res = "No";
        
        if(max < sum) {
            res = "Yes";
            
        } else {
            
        }
        
        System.out.println(res);
        
    }
    
}
