import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Map<String, Integer> map=new TreeMap<String, Integer>();

		for (int i = 1; i <= 13; i++) {
			map.put("S "+i, 0);
			map.put("H "+i, 0);
			map.put("C "+i, 0);
			map.put("D "+i, 0);

		}


		int x=scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < x; i++) {
			String s=scan.nextLine();
			map.put(s, map.get(s)+1);
		}
		for (int i = 1; i <= 13; i++) {
			if(map.get("S "+i)==0){
				System.out.println("S "+i);
			}
		}
		for (int i = 1; i <= 13; i++) {
			if(map.get("H "+i)==0){
				System.out.println("H "+i);
			}
		}
		for (int i = 1; i <= 13; i++) {
			if(map.get("C "+i)==0){
				System.out.println("C "+i);
			}
		}
		for (int i = 1; i <= 13; i++) {
			if(map.get("D "+i)==0){
				System.out.println("D "+i);
			}
		}
	}

}