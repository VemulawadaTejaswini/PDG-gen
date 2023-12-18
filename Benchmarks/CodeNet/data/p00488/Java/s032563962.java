import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] set = new int[5];
		for(int i = 0; i < 5; i++){
				set[i] = scan.nextInt();
		}
		scan.close();
		if(set[0] > set[1]){
			set[0] = set[1];
		}
		if(set[0] > set[2]){
			set[0] = set[2];
		}
		if(set[0] > set[1]){
			set[0] = set[1];
		}
		if(set[3] > set[4]){
			set[3] = set[4];
		}
		System.out.println(set[0] + set[3] - 50);
	}
}