import java.util.Scanner;

class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();

        StringBuffer sb = new StringBuffer(num1);
        sb.reverse();
        System.out.println(sb);

	}
}