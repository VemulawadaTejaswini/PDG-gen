import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()){
      int n=scan.nextInt();
      if(n==0)break;
      int []judge =new int[n];
      for(int i=0;i<n;i++)judge[i]=scan.nextInt();
      Arrays.sort(judge);
      int sum=0;
      for(int i=1;i<judge.length-1;i++)
    	  sum+=judge[i];
      System.out.println(sum/(n-2));
    			  
      }
        }
      

}