import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();

		for(int i=0;i<x;i++) {
			int tmp = sc.nextInt();
			array.add(tmp);
		}

		for(int i=x-1;i>=0;i--){
			System.out.print(array.get(i));
			if(i!=0) {
				System.out.print(" ");
			}
		}

		sc.close();
	}
}
