import java.util.*;

public class AOJ_02 {
	public static void main(String[] args) {

		int[] ar = new int[2]; 

		Scanner sc = new Scanner(System.in);

		while(true){

			for(int i = 0;i < 2;i++){
				ar[i] = sc.nextInt();
			}

			if (ar[0] != 0 || ar[1] != 0){
				Arrays.sort(ar);
				System.out.println(ar[0] + " " + ar[1]);
			} else {
				break;
			}
		}
	}
}