import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] p = new int[5];
		for(int i = 0; i < 5; i++){
			p[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		String ret = "Yay!";
		for(int i = 0; i < 4; i++){
			for(int j = i+1; j < 5; j++){
				if(p[j] - p[i] > k) ret=":(";
			}
}
		System.out.println(ret);
	}
}
