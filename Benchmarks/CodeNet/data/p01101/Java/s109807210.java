import java.util.*;
 
class Main {
      
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   int n=cin.nextInt(),m=cin.nextInt(),res=0;
    	   if(n==0)break;
           List<Integer> A=new ArrayList<>();
           
           for(int i=0;i<n;i++)A.add(cin.nextInt());
           
           for(int i=0;i<n-1;i++) {
        	   for(int j=i+1;j<n;j++) {
        		   
        		   int sum=A.get(i)+A.get(j);
        		   //System.out.println(sum);
        		   if(sum>res && sum<=m)res=sum;
        	   }
           }
           
           if(res!=0)System.out.println(res);
           else System.out.println("NONE");
       }
       
    }
     
 
}
