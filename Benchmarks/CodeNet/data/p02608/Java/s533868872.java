import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();

       int total=0;

	// 変数strの長さ分回す
       for(int o=1;o<=n;o++) {
	for (int i = 0; i <o; i++) {
		for(int j=0;j<o;j++) {
			for(int h=0;h<o;h++) {
			if(i*i+j*j+h*h+i*j+j*h+h*i==n) {
				total=total+1;
			}
		 }
		}
       }
	System.out.println(total);
       }
	}
}
