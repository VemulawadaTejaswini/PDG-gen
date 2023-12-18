import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
        	list.add(scanner.nextInt());
        }
        //listを降順にソート
        Collections.sort(list, Collections.reverseOrder());

        int Alice = 0;
        int Bob = 0;
        for (int i = 0; i < N; i++) {
        	if (i % 2 == 0) {
        		Alice += list.get(i);
        	} else {
        		Bob += list.get(i);
        	}
        }
        //System.out.println("Alice：" + Alice);
        //System.out.println("Bob：" + Bob);

        int div = Alice - Bob;
        System.out.println(div);
	}

}