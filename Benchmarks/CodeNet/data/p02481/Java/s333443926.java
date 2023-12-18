import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sanner=new Scanner(System.in);
		String[] s=sanner.nextLine().split(" ");
		int i=Integer.parseInt(s[0]);
		int j=Integer.parseInt(s[1]);
		System.out.println(i*j+" "+(i*2+j*2));
	}
}