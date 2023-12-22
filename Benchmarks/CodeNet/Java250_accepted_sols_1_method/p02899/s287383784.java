import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int student = scan.nextInt();
		int[] array = new int[student+1];

		for(int i=1;i<=student;i++) {
			int a = scan.nextInt();
			array[a] = i;
		}

		for(int i=1;i<=student;i++) {
			System.out.println(array[i]+" ");
		}
/*		Map番
 * Map<Integer,Integer> toukou = new TreeMap<Integer,Integer>();

		for(int i=1;i<=student;i++) {
			toukou.put(scan.nextInt(),i);
		}
		for(Integer key:toukou.keySet()){
			System.out.println(toukou.get(key) + " ");
		}

*/
		scan.close();

	}

}
