import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	//A
	/*
	public static void main(String[] args){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if((Math.abs(b - a )<=d && Math.abs(c-b)<= d)||Math.abs(c-a) <= d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}*/

	//B
	public static void main(String[] args){
		int X = sc.nextInt();
		int i = 2;
		int ans = 0;
		if(X == 1){
			System.out.println("1");
		}else{
			while(i*i <= X){
				int tmp = i*i;
				while(tmp <= X){
					tmp*=i;
				}
				tmp /= i;
				if(tmp > ans)
				ans = tmp;
				i++;
			}
			System.out.println(ans);
		}
	}

}