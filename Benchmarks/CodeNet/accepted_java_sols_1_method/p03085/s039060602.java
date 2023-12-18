import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		sc.close();
		String ans[] = {"A", "G", "T", "C"};
		int a = 0;
		for(int i = 0;i < ans.length; ++i) 
			if(b.equals(ans[i]))a = i;
		a += 2;
		if(a > 3)a %= 2;
		System.out.println(ans[a]);
	}

}
