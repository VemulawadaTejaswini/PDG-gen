import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());

		int[] values = new int[line];
		for(int i=0;i<line;i++){
			values[i] = i+1;
		}

		for(int i=0;i<n;i++){
			String[] s = sc.nextLine().split(",");
			int a = Integer.parseInt(s[0]);
			int b= Integer.parseInt(s[1]);

			int value = values[a-1];
			values[a-1] = values[b-1];
			values[b-1] = value;
		}

		for(int i=0;i<line;i++){
			System.out.println(values[i]);
		}
	}
}