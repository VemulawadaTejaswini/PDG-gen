import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int d = scan.nextInt();
	int n = scan.nextInt();

	if(n == 100){
	    System.out.println((int)(n*Math.pow(100,d)+1*Math.pow(100,d)));
	}else{
	    System.out.println((int)(n*Math.pow(100,d)));
	}
    }
}
