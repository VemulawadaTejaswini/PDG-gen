import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int t[] = new int[4];
		int m[] = new int[4];
		for(int i = 0; i<4 ; i++){
			t[i] = scan.nextInt();
			m[i] = scan.nextInt();
		}
		for(int i = 0; i<4 ; i++){
			if(t[i] == 1){
				System.out.println(6000*m[i]);
			}else if(t[i] == 2){
				System.out.println(4000*m[i]);
			}else if(t[i] == 3){
				System.out.println(3000*m[i]);
			}else{
				System.out.println(2000*m[i]);
			}
		}
	}
}