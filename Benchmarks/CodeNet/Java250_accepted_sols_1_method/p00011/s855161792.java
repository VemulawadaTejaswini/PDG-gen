import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int lot[] = new int[w];

		String bar;
		String s[];
		int a;
		int b;
		int save;

		for (int i = 0; i < w; i++){
			lot[i] = i + 1;
		}

		for (int i = 0; i < n; i++){
			bar = sc.next();
			s = bar.split(",");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);

			save = lot[b-1];
			lot[b-1] = lot[a-1];
			lot[a-1] = save;
		}

		for (int i = 0; i < w; i++){
		System.out.println("" + lot[i]);
		}

	}
}