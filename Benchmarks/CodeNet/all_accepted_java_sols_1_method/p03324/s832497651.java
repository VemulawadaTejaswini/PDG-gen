import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str="00";
	  String nbefore="1";
	  int N,D,n,ans;
	  D=sc.nextInt();
	  N=sc.nextInt();
	  if(N==100) {
		  N=101;
	  }
	  for(int i=0;i<D;i++) {
		  nbefore=nbefore+str;

	  }
	  n=Integer.parseInt(nbefore);
	  ans=n*N;
	  System.out.println(ans);
  }
}
