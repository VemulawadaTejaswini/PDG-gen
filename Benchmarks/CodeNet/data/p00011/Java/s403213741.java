import java.util.Scanner;
public class Main{
	public static void swap(int n[], int a, int b)
	{
		int tmp = n[a-1];
		n[a-1] = n[b-1];
		n[b-1] = tmp;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int num[] = new int[w];
		for(int i = 1 ; i <= w ; i++)
			num[i-1] = i;
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			String str = sc.next();
			String[] str2 = str.split(",");
			int a = Integer.parseInt(str2[0]);
			int b = Integer.parseInt(str2[1]);
			swap(num,a,b);
		}
		for(int i = 0 ; i < w ; i++)
			System.out.println(num[i]);
	}
}
