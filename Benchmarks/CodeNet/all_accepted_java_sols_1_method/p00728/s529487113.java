import java.util.*;
 
class Main {
    
	static int res=0,d,w,E[][]=new int[10][10];
	
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   int n=cin.nextInt();
    	   if(n==0)break;
    	   
    	   List<Integer> list=new ArrayList<>();
    	   for(int i=0;i<n;i++)list.add(cin.nextInt());
    	   
    	   Collections.sort(list);
    	   
    	   int res=0;
    	   for(int i=1;i<n-1;i++)res+=list.get(i);
    	   
    	   System.out.println(res/(n-2));
       }
    }
}
