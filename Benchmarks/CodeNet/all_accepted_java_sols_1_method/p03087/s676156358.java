import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int m=sc.nextInt();
      String po=sc.next();
      int num[]=new int[n+1];
      num[0]=0;
      for(int i=0;i<n-1;i++){
          num[i+1]=num[i]+((po.substring(i,i+2).equals("AC"))?1:0);
      }
      
      for(int i=0;i<m;i++){
      	int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(num[b-1]-num[a-1]);
      }
    }
}
