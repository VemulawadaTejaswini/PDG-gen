import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//a～bまでの整数の内、cの約数がいくつあるかを調べる
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++){
			if(c%i==0){
				count++;
			}
		}
		System.out.println(count);
	}

}

