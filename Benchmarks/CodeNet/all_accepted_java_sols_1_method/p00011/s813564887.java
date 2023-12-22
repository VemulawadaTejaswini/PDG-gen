import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[w];
		for(int i = 0 ; i < a.length ; i++){
			a[i] = i+1;
		}
		
		for (int i = 0 ; i < n ; i++){
			String str = sc.next();
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