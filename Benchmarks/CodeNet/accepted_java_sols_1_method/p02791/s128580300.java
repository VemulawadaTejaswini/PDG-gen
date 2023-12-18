import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int[] n = new int[a];
		for(int i = 0; i < a; i++){
			n[i] = Integer.parseInt(sc.next());
		}
		int cnt = 1, min = n[0];
		for(int i = 1; i < a; i++){
			if(min > n[i]){
				cnt++;
				min = n[i];
			}
		}
		System.out.println(cnt);
	}
}
