import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] lot = new int[w];
		sc.nextLine();
		for(int i = 0 ; i < w ; i++){
			lot[i] = i+1;
		}
		for(int i = 0; i < n; i++){
			swap(lot, sc.nextLine().split(","));
		}
		sc.close();
		for(int i = 0; i < w; i++){
			System.out.println(lot[i]);
		}
	}
	static void swap(int[] source, String[] s){
		int a = Integer.parseInt(s[0])-1;
		int b = Integer.parseInt(s[1])-1;
		int tmp = source[a];
		source[a] = source[b];
		source[b] = tmp;
	}
}