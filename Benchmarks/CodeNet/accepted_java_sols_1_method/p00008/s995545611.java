import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n;
		int cou;
		while(scan.hasNext()){
			cou = 0;
			n = scan.nextInt();
			for(int a = 0;a<10;a++){
				for(int b = 0;b<10;b++){
					for(int c = 0;c<10;c++){
						for(int d =0;d<10;d++){
							if(a + b + c + d == n){
								++cou;
							}
						}
					}
				}
			}
			System.out.println(cou);
		}
	}
}