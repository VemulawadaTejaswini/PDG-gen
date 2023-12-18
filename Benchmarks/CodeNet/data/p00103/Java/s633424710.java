import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String line;
		int out,point,player = 0;
		for (int i = 0; i < n; i++) {
			out = 0;
			point = 0;
			player = 0;
			while (out < 3) {
				line = scn.nextLine();
				switch (line) {
				case "HIT":
					player = player * 10 + 1;
					if(player > 1000) {
						player %= 1000;
						point++;
					}
					break;
				case "HOMERUN":
					point++;
					while(player !=0) {
						point += player%10;
						player /= 10;
					}
					break;
				case "OUT":
					out++;
					break;
				}
			}
			System.out.println(point);
		}
	}
}
