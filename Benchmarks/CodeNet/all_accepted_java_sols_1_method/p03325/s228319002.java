import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      int n,ans,m;
      long a;
      ans=0;
      n=sc.nextInt();

      for(int i=0;i<n;i++) {
    	  a=sc.nextInt();
    	  for( m=0;a%2==0;m++) {
    		  a=a/2;


    	  }
    	  ans=ans+m;
      }
      System.out.println(ans);

  }
}
