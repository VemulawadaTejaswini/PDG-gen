import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int l=sc.nextInt(),r=sc.nextInt(),d=sc.nextInt(),count=0;
	  for(int i=l;i<=r;i++)if(i%d==0)count++;
	  System.out.println(count);
  }
}
