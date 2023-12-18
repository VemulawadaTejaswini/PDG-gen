import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	ArrayList<Integer> seven = new ArrayList<>();
	int inputK = sc.nextInt();
	int count = 0;
	int ten = 1;
	int se = 0;

	if(inputK % 2 == 0) {
		System.out.println(-1);
	}

	while(true) {
		seven.add(7);
		for(int i = 0; i < seven.size(); i++) {
			count ++;
			se += seven.get(i) * ten;
			ten *= 10;
		}
		if(se % inputK == 0) {
			break;
		}
	}
	System.out.println(count);
}
}
