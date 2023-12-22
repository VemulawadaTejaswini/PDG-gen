import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] s=sc.nextLine().toCharArray();
		char[] t=sc.nextLine().toCharArray();
		int i=0;
		for(int j=0;j<3;j++) {
			if(s[j]==t[j])i++;
		}
		System.out.println(i);
	}
}