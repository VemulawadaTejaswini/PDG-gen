import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,m,i,j,k,p,q,o,l,s,tt=1,t,z,aa,r=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        k=0;
      for(i=1;i<=9;i++)
      {
          if(n%i==0)
          {
              if(n/i<10)
              {
                  k=1;
                  break;
              }
          }

      }
      if(k==1)
      {
          System.out.println("Yes");
      }
      else
      {
          System.out.println("No");
      }

    }
}
