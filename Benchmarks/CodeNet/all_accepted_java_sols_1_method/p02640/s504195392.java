import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		boolean juge = false;
		for(int x=0; x<=X; x++) {
			for(int y=0; y<=X; y++) {
				if(x+y == X && 2*x + 4*y == Y) {
					juge =true; break;
				}
			}
			if(juge) {break;}
		}
		if(juge) {System.out.println("Yes");}
		else {System.out.println("No");}
	}

}
