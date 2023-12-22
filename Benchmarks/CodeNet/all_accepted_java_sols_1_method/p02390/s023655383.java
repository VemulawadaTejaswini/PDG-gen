import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int hms = sc.nextInt();
		System.out.println(hms/3600 + ":" + hms%3600/60 + ":" + hms%3600%60);
	}
}