import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 0;
		for( ; a<=b; a++){
			if(c%a==0) cnt++;
		}
		System.out.println(cnt);
	}
}