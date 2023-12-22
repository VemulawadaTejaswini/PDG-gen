import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while(true){
        	int n=scan.nextInt();
        	if(n==0)break;
        	HashMap<String,String> hash =new HashMap<String,String>();
        	
        	for(int i=0;i<n;i++)hash.put(scan.next(),scan.next());
        	int m=scan.nextInt();
        	
        	for(int i=0;i<m;i++){
        		String in =scan.next();
        		
        		if(hash.containsKey(in))
        			System.out.print(hash.get(in));
        		else System.out.print(in);
        	}
        	System.out.println();
        }
    }
}