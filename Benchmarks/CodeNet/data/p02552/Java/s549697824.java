import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 int x=input.nextInt();
		 if(x>=0 && x<=1) {
			 if(x==0)
				 System.out.println(1);
			 if(x==1)
				 System.out.println(0);
		 }

  }
}
