import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();int d=sc.nextInt();
      int max=Math.max(Math.max(a,b),c);
      int sum=a+b+c-max;
      for(int i=0;i<d;i++)max*=2;
      System.out.println(sum+max);
    }
}
