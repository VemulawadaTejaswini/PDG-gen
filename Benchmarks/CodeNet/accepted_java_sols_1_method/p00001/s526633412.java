import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int h[] = new int[10];
		int n = 0;
		for(int i = 0; i < 10; i++){
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++){
			for(int j = i + 1; j < 10; j++){
				if(h[i] < h[j]){
					n = h[j];
					h[j] = h[i];
					h[i] = n;
				}
			}
		}
		for(int i = 0; i < 3; i++){
			System.out.println(h[i]);
		}
	}
}