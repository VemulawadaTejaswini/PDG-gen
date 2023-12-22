import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner keyboardScanner=new Scanner(System.in);
		int k=keyboardScanner.nextInt();
		int cc;
		if(k%2==0) {cc=(k/2)*(k/2);}
		else {cc=(k/2)*((k/2)+1);}
		System.out.println(cc);
	}
}