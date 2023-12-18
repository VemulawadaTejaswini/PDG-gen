import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	x%=10;
	if(x==2||x==4||x==5||x==7||x==9)
	    System.out.println("hon");
	else if(x==0||x==1||x==6||x==8)
	    System.out.println("pon");
	else
	    System.out.println("bon");
      }
}
