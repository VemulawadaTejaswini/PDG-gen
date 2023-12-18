import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	long sum = 0;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i=0;i<N;i++) {
			int A = sc.nextInt();
			sum += A;
		    if (map.containsKey(A)) {
		        map.put(A, map.get(A) + 1);
		    } else {
		        map.put(A, 1);
		    }
		}

		int Q = sc.nextInt();
		for(int i=0;i<Q;i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			if(map.containsKey(B)) {
				int num = map.get(B);
				map.put(B,0);
				if(map.containsKey(C)) {
					map.put(C,map.get(C)+num);
				} else {
					map.put(C, num);
				}
				sum = sum + (C-B) * num;
				System.out.println(sum);
			} else {
				System.out.println(sum);
			}
		}
    }
}
