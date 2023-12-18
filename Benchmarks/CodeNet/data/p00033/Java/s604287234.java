import java.util.Scanner;


public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int l=0;
			int r=0;
			for(int j=0; j<10; j++){
				int num = sc.nextInt();
				if(l<num){
					l=num;
				}else if(r<num){
					r=num;
				}else{
					System.out.println("NO");
					break;
				}
				if(j==9)System.out.println("YES");
			}
		}
	}
}