import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int x[] = new int[10];
		while(scan.hasNext()){
			int a = scan.nextInt();
			x[a-1]++;
		}
		int mux = x[0];
		for(int i = 1 ; i < x.length ; i++){
			if(mux < x[i]){
				mux = x[i];
			}
		}
		for(int i = 0 ; i < x.length ; i++){
			if(mux == x[i]){
				System.out.println(x[i]);
			}
		}
	}
}