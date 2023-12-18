import java.util.Scanner;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != 0){
			int a[] = new int[n];
			for(int i = 0; i < n ; i++){
				a[i] = scan.nextInt();
			}
			int b[] = {0,0,0,0,0,0,0};
			for(int i = 0; i < n ; i++){
				if(a[i] < 10){
					b[0]++;
				}else if(a[i] < 20){
					b[1]++;
				}else if(a[i] <30){
					b[2]++;
				}else if(a[i] < 40){
					b[3]++;
				}else if(a[i] < 50){
					b[4]++;
				}else if(a[i] < 60){
					b[5]++;
				}else{
					b[6]++;
				}
			}
			for(int i = 0 ; i < 7 ; i++){
				System.out.println(b[i]);
			}
			n = scan.nextInt();
		}
	}
}