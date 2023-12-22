import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),count=0;
	  String s="";
	  for(int i=1;i<=n;i++) {
		  s=String.valueOf(i);
		  if(s.length()%2!=0)count++;
	  }

	  System.out.println(count);
  }
}
