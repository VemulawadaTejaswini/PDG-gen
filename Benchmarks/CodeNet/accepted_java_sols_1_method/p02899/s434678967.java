import java.util.*;
import java.util.TreeMap;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Map<Integer, Integer> students = new TreeMap<Integer, Integer>();
		for(int i=1;i<=N;i++){
			students.put(sc.nextInt(),i);
		}
		for (Integer nKey : students.keySet())
        {
            System.out.println(students.get(nKey));
        }
		sc.close();
	}
};