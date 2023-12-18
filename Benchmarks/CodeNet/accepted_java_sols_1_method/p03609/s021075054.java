import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC = new Scanner(System.in);
int x = SC.nextInt();
int t = SC.nextInt();
int Sandleft = x - t;
if(x <= t) {
	System.out.println(0);
}
else {
	System.out.println(Sandleft);
}
	}

}