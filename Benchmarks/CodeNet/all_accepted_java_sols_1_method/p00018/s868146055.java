import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ns[] = new int[5];
		for(int i=0; i<ns.length; i++){
			ns[i] = scan.nextInt();
		}

		Arrays.sort(ns);

		for(int i = ns.length-1; i >= 0; i--){
			if(i>0){
				System.out.print(ns[i] + " ");
			}else{
				System.out.println(ns[i]);
			}
		}

	}
}