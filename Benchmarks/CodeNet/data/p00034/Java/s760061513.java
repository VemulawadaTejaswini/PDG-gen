import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] blockDistance = new int[10];
	int v1, v2;
	String[] input;
	while (scan.hasNext()) {
	    input = scan.nextLine().split(",");
	    for (int i = 0; i < 10; i++) {
		blockDistance[i] = Integer.parseInt(input[i]);
	    }
	    v1 = Integer.parseInt(input[10]);
	    v2 = Integer.parseInt(input[11]);
	    System.out.println(solve(v1, v2, blockDistance));
	}
    }
    static int solve (int v1, int v2, int[] blockDistance) {
	int alldistance = 0;
	for (int i = 0; i < 10; i++) {
	    alldistance += blockDistance[i];
	}
	double time = alldistance / (double)(v1 + v2);
	double meetplace = v1 * time;
	int i = 0;
	while (meetplace > 0) {
	    meetplace -= blockDistance[i++];
	}
	return i;
    }
}