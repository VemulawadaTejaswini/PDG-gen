import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cN = sc.nextInt();
		int nL = sc.nextInt();

		ArrayList<String> dics = new ArrayList<String>();

		for(int i=0; i< cN;i++){
			dics.add(sc.next());
		}

		Collections.sort(dics);

		String dicsordered = "";
		for(int i=0; i< cN;i++){
			dicsordered = dicsordered + dics.get(i);
		}
		System.out.println(dicsordered);

	}
}
