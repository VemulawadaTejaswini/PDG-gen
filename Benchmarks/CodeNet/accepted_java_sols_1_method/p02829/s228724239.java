import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 6;
        System.out.println(c - a - b);
	}
}
