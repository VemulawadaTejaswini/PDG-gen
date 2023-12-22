import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
      if(n<m){
        int po=n;
        n=m;
        m=po;
      }
      for(int i=0;i<n;i++)System.out.print(m);
    }
}
