import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String tmp = Integer.toString(N);
		long s = 0;
		for(int i = 0;i<tmp.length();i++){
			s += Integer.parseInt(tmp.substring(i, i+1));
		}
		
		if(N%s==0)
			System.out.println("Yes");
		else
			System.out.println("No");}
}
