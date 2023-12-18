import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;

	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();

		for(;n != 0; n--) {
			looprun();
		}

		scan.close();
	}

	private int outcount,point;
	private int runner[] = new int[3];
	private String result;

	private void looprun() {
		outcount = 0;
		point = 0;
		Arrays.fill(runner,0);

		while(outcount < 3) {
			result = scan.next();

			if(result == null) {
				System.out.println("ぬるぽ");
			}else {
				switch(result) {
				case "HIT":
					for(int i = 2;i >= 0;i--) {
						if(runner[i] == 1) {
							runner[i] = 0;
							if(i == 2) {
								point++;
							}else {
								runner[i + 1] = 1;
							}
						}
					}
					runner[0] = 1;
					break;

				case "HOMERUN":
					point += Arrays.stream(runner).sum() + 1;
					Arrays.fill(runner,0);
					break;

				case "OUT":
					outcount++;
					break;

				default:
					break;
				}
			}
		}

		System.out.println(point);
	}
}
