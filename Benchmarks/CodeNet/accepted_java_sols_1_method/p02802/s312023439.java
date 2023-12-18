import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mondai = scan.nextInt();
		int kaisu = scan.nextInt();

		int countAC = 0;
		int[] countWA = new int [mondai];
		int pena = 0;

		TreeMap<Integer,String> takahashi = new TreeMap<Integer,String>();

		for(int i=0;i<kaisu;i++) {

			Integer toi = scan.nextInt();
			String check = scan.next();


			if(takahashi.containsKey(toi)) {
				if(takahashi.get(toi).equals("AC")) {

					continue;
				}else {
					takahashi.put(toi,check);
						if(check.contentEquals("AC")) {
							countAC++;
							continue;
						}else if(check.contentEquals("WA")){
							countWA[toi-1]++;
							continue;
						}
				}
			}

				takahashi.put(toi,check);
				if(check.equals("AC")) {
					countAC++;
				}else if(check.equals("WA")) {
					countWA[toi-1]++;
				}
		}

				for(Integer key:takahashi.keySet()) {
					if(takahashi.get(key).equals("AC")) {
						pena += countWA[key-1];
					}
				}

		System.out.println(countAC+ " " +pena);
		scan.close();

	}

}
