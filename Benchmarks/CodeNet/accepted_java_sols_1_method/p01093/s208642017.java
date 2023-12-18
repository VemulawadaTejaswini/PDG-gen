import java.util.*;
 
class Main {
	
    public static void main(String[] args) {
         
        Scanner cin=new Scanner(System.in);
        while(true) {
        	
        	int n=cin.nextInt();
        	if(n==0)break;
        	
        	List<Integer> data = new ArrayList<>();
        	
        	for(int i=0;i<n;i++)data.add(cin.nextInt());
        	
        	Collections.sort(data);
        	
        	int res=1000000;
        	
        	for(int i=0;i<n-1;i++) res=Math.min(data.get(i+1)-data.get(i), res);
        	
        	System.out.println(res);
        	
        }
        
    }
}
