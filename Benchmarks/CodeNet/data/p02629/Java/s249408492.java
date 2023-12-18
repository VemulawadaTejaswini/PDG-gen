import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long n=sc.nextLong();
	  StringBuilder res=new StringBuilder();
	  while(n-- > 0) {
		  System.out.println(n);
		  res.append((char)('a'+(n%26)));
		  n/=26;
	  }
	  System.out.println(res.reverse());
  }
}
