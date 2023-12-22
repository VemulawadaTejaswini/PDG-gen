import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;

		List<Integer> cost = new ArrayList<>();

		for(int i=0;i<N;i++) cost.add(sc.nextInt());

		Collections.sort(cost);

		for(int i=0;i<K;i++) sum+=cost.get(i);

		System.out.println(sum);
	}

}