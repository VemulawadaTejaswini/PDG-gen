import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[]n = new int [5];
		for(int i = 1;i < 5;i++){
			int t = in.nextInt();
			n[t] = in.nextInt();
			if(t == 1){
				System.out.println(6000*n[1]);
			}else if(t == 2){
				System.out.println(4000*n[2]);
			}else if(t == 3){
				System.out.println(3000*n[3]);
			}else{
				System.out.println(2000*n[4]);
			}
		}
	}
}