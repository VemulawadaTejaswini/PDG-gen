import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 3; i++){
			int time = -(sc.nextInt()*3600 + sc.nextInt()*60 + sc.nextInt()) + (sc.nextInt()*3600 + sc.nextInt()*60 + sc.nextInt());
			System.out.println((time/3600) + " " + ((time/60)%60) + " " + (time % 60));
		}
	}

}