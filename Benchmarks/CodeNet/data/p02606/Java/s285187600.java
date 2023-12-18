import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
		int l=scanner.nextInt();
       int r=scanner.nextInt();
       int d=scanner.nextInt();
       int total=0;
         
	// 変数strの長さ分回す
	for (int i = l; i <=r; i++) {
	   if(i%2==0){
       total=total+1;
       }
	System.out.println(total);
	}}
}
