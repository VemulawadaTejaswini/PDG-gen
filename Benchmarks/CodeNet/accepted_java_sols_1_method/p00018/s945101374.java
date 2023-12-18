import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n[] = new int[5];
		for(int i = 0; i<5 ; i++){
			n[i] = scan.nextInt();
		}
		int t = 0;
		for(int i = 0 ; i < 5 ; i++){
			for(int j = i+1 ; j < 5 ; j++){
				if(n[i] < n[j]){
					t = n[i];
					n[i] = n[j];
					n[j] = t;
				}
			}
		}
		for(int i = 0 ; i < 5 ; i++){
			if(i == 4){
				System.out.println(n[i]);
			}else{
				System.out.print(n[i] + " ");
			}
		}
	}
}