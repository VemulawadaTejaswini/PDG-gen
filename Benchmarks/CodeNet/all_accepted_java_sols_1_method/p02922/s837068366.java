import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int in = 1;
		int ct = 1;
		if(b == 1){
			ct = 0;
		}else if(a >= b){

		}else{
			ct = 0;
			do{
				in += a -1;
				ct ++;
			}while(in < b);
		}
		System.out.println(ct);
	}


}