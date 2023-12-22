import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		int count = 1;


		Map<String,Integer> hikaku = new TreeMap<String,Integer>();

		for(int i=0;i<seisu;i++){

			String suzi = scan.next();

			if(!hikaku.containsKey(suzi)) {

				count = 0;
				hikaku.put(suzi,count);
			}else {
				count = 1;
				hikaku.put(suzi, count);
			}
		}

		System.out.println(!hikaku.containsValue(1)?"YES":"NO");

		scan.close();

	}

}
