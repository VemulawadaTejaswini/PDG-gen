import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long o=0;
        int n=sc.nextInt();
      	ArrayList<Integer> list=new ArrayList<Integer>();
      	for(int j=0;j<n;j++){
          	int a=sc.nextInt();
          	list.add(a);
          	o+=a;
    	}
      	
      	int q=sc.nextInt();
      	for(int i=0;i<q;i++){
        	int a=sc.nextInt();
          	int b=sc.nextInt();
            int num=0;
          	while(list.remove(new Integer(a))){
            	list.add(b);
              	num++;
            }
          	o+=num*(b-a);
          	System.out.println(o);
        }
        
      
    }
    
}