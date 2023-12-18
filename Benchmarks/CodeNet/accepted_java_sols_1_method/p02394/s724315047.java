import java.util.Scanner;

public class Main {

public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int W =s.nextInt();
	int H= s.nextInt();
	int x = s.nextInt();
	int y = s.nextInt();
	int r = s.nextInt();
	if(x + r <= W && y + r <= H && x>=r && y>=r) System.out.println("Yes");
	else System.out.println("No");
	s.close();
}
}

