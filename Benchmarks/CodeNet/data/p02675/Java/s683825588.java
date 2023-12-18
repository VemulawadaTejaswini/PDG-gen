import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
	int d = i%10;
	if(d==2||d==4||d==5||d==7||d==9) {
	System.out.println("hon");
	}else if
	(d==0||d==1||d==6||d==8) {
	System.out.println("pon");
    }else {
    	System.out.println("bon");
    }
	sc.close();
	}
    }