import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int num[];
		num = new int[w];
		for(int i = 0 ; i < w ; i++) {
			num[i] = i + 1;
		}
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			String str = sc.next();
			String sp[] = str.split(",");
			int a = Integer.parseInt(sp[0]) - 1;
			int b = Integer.parseInt(sp[1]) - 1;
			int swap = num[a];
			num[a] = num[b];
			num[b] = swap;
		}
		for(int i = 0 ; i < w ; i++) System.out.println(num[i]);
		sc.close();
	}
}
