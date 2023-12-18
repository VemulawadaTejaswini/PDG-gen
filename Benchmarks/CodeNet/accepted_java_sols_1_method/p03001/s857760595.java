import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	int W = std.nextInt();
	int H = std.nextInt();
	int x = std.nextInt();
	int y = std.nextInt();

	//四角形の中心の場合 1
	double full = (double)W*(double)H;
    double half = (double)full/2;
	System.out.println(half);

	double halfx = (double)W/2;
	double halfy = (double)H/2;




	if((double)x == halfx && (double)y == halfy) {
		System.out.println('1');
	}
	else {
	System.out.println('0');
	}

	}


	}


