import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] n = new int[2];
		for(int i = 0; i < 2; i++){
			n[i] = stdIn.nextInt();
			if(n[0] == 0 && n[1] == 0) break;
		}
		if(n[0] > n[1]){
			System.out.println(n[1] +" "+ n[0]);
		}
	}
}