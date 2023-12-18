import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> ai = new ArrayList<>();

		int sum = 0;

		//nの数だけ入力、配列に格納
		for(int i =0; i < n; i++){
			int matrix = scan.nextInt();
			ai.add(matrix);
			sum += ((Integer)ai.get(i)).intValue();

		}

		int min = ai.get(0);
		int max = ai.get(0);

		for(int i =0; i < n; i++){
			if(min > ai.get(i)){
				min = ai.get(i);

				if(max <ai.get(i)){
					max = ai.get(i);
				}
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}
}

