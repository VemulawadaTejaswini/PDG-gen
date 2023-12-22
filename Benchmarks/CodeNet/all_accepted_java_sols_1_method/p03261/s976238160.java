import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] w = new String[n];
		for (int i = 0; i < n; i++)
			w[i] = in.next();
		int flag = 0;
		
		for (int i = 0; i < n - 1; i++){
			if (w[i].charAt(w[i].length() - 1) != w[i + 1].charAt(0))
				flag++;
			for (int j = i + 1; j < n; j++){
				if (w[i].equals(w[j]))
					flag++;
			}
		}
		
		if (flag > 0)
			System.out.println("No");
		else
			System.out.println("Yes");
		

	}

}