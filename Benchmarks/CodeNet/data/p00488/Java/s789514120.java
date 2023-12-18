import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p[] = new int[5];
		int j[] = new int[5];
		for(int i = 0; i < 3; i++){
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++){
			j[i] = sc.nextInt();
		}
		
		int pmin = p[0];
		for(int i = 0; i < 3; i++){
			if(p[0] >= p[i]){
				pmin = p[i];
			}
		}
		int jmin = j[0];
		for(int i = 0; i < 2; i++){
			if(j[0] >= j[i]){
				jmin = j[i];
			}
		}
		
		int ans = pmin + jmin - 50;
		System.out.println(ans);
	}
}