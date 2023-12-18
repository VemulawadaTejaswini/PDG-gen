import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(scan.hasNext()){
			int x=scan.nextInt();
			ArrayList<Integer> list=new ArrayList<Integer>();
			
			for (int i = 0; i < x; i++) {
				list.add(scan.nextInt());
			}
			
			Collections.reverse(list);
			for (int i = 0; i < x; i++) {
				System.out.print(list.get(i));
				if(i<x-1)
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}