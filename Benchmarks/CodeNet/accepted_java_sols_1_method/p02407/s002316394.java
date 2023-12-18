import java.util.Arrays;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//?????????
        StringBuilder sb=new StringBuilder("");
		int n = scan.nextInt();
		int[]hako = new int[n];
		
		for(int i = 0; i < hako.length ; i++){
			int a = scan.nextInt();
			hako[i] = a; 
		}//for
	    

		
		//??\?????????
		for(int i = hako.length-1; i >= 0; i--){
			sb.append(hako[i]);
			if(i > 0){
				sb.append(" ");
			}
		}//for
		
		//??????
		System.out.println(sb);
	}
}