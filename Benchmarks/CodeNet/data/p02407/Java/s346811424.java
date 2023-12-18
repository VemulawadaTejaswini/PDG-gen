import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//?????????
        StringBuilder sb=new StringBuilder("");
		int n = scan.nextInt();
		Integer[] hako = new Integer[n];
		
		//??????
		
		for(int i = 0; i < hako.length ; i++){
			int a = scan.nextInt();
			hako[i] = a; 
		}//for
		
		//??????????????????
		Arrays.sort(hako, Collections.reverseOrder());
		
		//??\?????????
		for(int i = 0; i < hako.length; i++){
			sb.append(hako[i]);
			if(i < hako.length-1){
				sb.append(" ");
			}
		}//for
		
		//??????
		System.out.println(sb);
	}