
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//Osaki
	//count yamanote sen train

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			ArrayList<Integer> al = new ArrayList<>();
			
			al.add(0);
			
			loopn: for(int i=0;i<n;i++) {//nの数ループ
				int launch = calcSec(sc.next());
				int arrive = calcSec(sc.next());
				for(int j=0;j<al.size();j++) {//電車の数だけループ
					if(launch >= al.get(j)) {
						al.set(j, arrive);
						continue loopn;
					}
				}//END for(j)
				al.add(arrive);
			}//END for(i)
			System.out.println(al.size());
		}//END while
		sc.close();
	}

	public static int calcSec(String str) {
		int hour = Integer.parseInt(str.substring(0, 2));
		int min = Integer.parseInt(str.substring(3, 5));
		int sec = Integer.parseInt(str.substring(6));
		return sec + (min + hour * 60) * 60;
	}

}//END Main
