import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] x = line.split(" ");
		int H = Integer.parseInt(x[0]);
		int W = Integer.parseInt(x[1]);
		int i = 0;
		String str = "";
		while (i < H) {
			str += "#";
			i++;
		}
		int j = 0;
		while (j < W) {
			System.out.println(str);
			j++;
		}
	}

}