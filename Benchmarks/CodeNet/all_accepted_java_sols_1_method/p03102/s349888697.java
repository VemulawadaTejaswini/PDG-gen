import java.util.*;

public class Main {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int ans[]=new int[m];
      int k=sc.nextInt();
      for(int i=0;i<m;i++)ans[i]=sc.nextInt();
      int aaa=0;
      for(int i=0;i<n;i++){
      	int po=0;
        for(int j=0;j<m;j++){
        po+=ans[j]*sc.nextInt();
        }
        if(po+k>0)aaa++;
      }
      System.out.println(aaa);
    }
}
