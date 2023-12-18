import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] timeList = new int[n];
      for(int i=0;i<n;i++){
        timeList[i]=sc.nextInt();
      }      
      int m =  sc.nextInt();
      for(int i=0;i<m;i++){
       int[] timeListWK = new int[n];
       System.arraycopy(timeList,0,timeListWK,0,timeList.length);
       int p = sc.nextInt();
       int x = sc.nextInt();
       timeListWK[p-1] = x;
       int count =0;
       for(int j=0;j<timeListWK.length;j++){
         count = count + timeListWK[j];
       }
       System.out.println(count);
      } 
	}
}