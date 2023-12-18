import java.util.Scanner;

public class Main {

public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int a =s.nextInt();
	int a1 = a/3600,a2 = a%3600;
	int b1 = a2/60,c1 = a2%60;
	System.out.println(a1+":"+b1+":"+c1);
	s.close();
}


}

