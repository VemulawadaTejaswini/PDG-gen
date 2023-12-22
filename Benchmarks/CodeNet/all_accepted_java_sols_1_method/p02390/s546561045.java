import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ymd = sc.nextInt();
		System.out.println(ymd/3600 + ":" + ymd%3600/60 + ":" + ymd%3600%60);
	}
}