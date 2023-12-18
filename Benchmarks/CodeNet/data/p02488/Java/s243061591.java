import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x=scan.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		for (int i = 0; i < x; i++) {
			list.add(scan.next());
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}

}