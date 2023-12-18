import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[w];
		for(int i = 0 ; i < a.length ; i++){
			a[i] = i+1;
		}
		
		for (int i = 0 ; i < h ; i++){
			String str = br.readLine();
			String[] stra = str.split(",");
			int x = Integer.parseInt(stra[0]);
			int y = Integer.parseInt(stra[1]);
			int swap = a[x-1];
			a[x-1] = a[y-1];
			a[y-1] = swap;
		}
		for(int z : a){
			System.out.println(z);
		}
		sc.close();
	}

}