import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		String yama;
		int m,h;
		while(true){
			yama=sc.next();
			if(yama.equals("-"))break;
			m=sc.nextInt();
			for(int i=0;i<m;i++){
				h=sc.nextInt();
				yama=yama.substring(h)+yama.substring(0,h);
			}
			System.out.println(yama);
		}
	}
}