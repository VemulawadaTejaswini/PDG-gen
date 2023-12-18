import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		String temp = IN.nextLine();
		int tem = String.parseInt(temp);
		if(tem.compareTo(30) < 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}