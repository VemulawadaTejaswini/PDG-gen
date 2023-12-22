import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int legs=sc.nextInt();
      if(legs<=(n*4)&&legs>=(n*2)&&(legs%2)==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
