import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt(), sy = sc.nextInt(), tx = sc.nextInt(), ty = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		/* s to t (1st) */
		for(int i = 0; i < ty - sy; i++) sb.append("U");
		for(int i = 0; i < tx - sx; i++) sb.append("R");

		/* t to s (1st) */
		for(int i = 0; i < ty - sy; i++) sb.append("D");
		for(int i = 0; i < tx - sx; i++) sb.append("L");

		/* s to t (2nd) */
		sb.append("L");
		for(int i = 0; i < ty - sy + 1; i++) sb.append("U");
		for(int i = 0; i < tx - sx + 1; i++) sb.append("R");
		sb.append("D");

		/* t to s (2nd) */
		sb.append("R");
		for(int i = 0; i < ty - sy + 1; i++) sb.append("D");
		for(int i = 0; i < tx - sx + 1; i++) sb.append("L");
		sb.append("U");

		System.out.println(sb.toString());
	}
}