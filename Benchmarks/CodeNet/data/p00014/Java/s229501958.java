import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int d = Integer.parseInt(sc.nextLine());
			int value = 0,s = 0;

			while(value != 600-d){
				value += d;
				int line = value*value;
				s += line*d;
			}
			System.out.println(s);
		}
	}
}