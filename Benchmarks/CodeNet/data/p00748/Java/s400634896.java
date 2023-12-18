import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] arrs){
		
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> pollock = new ArrayList<Integer>();
		ArrayList<Integer> pollockk = new ArrayList<Integer>();

		int pollocknum = 0;
		int[] pollocktrue = new int[1000000 + 1];
		int[] pollocktrue2 = new int[1000001];
		Arrays.fill(pollocktrue, Integer.MAX_VALUE/2);
		Arrays.fill(pollocktrue2, Integer.MAX_VALUE/2);
		
		for(int i = 1; pollocknum <= 1000000 - 1; i++){
			pollock.add(pollocknum); 
			pollocktrue2[pollocknum] = 1;
			if(pollocknum%2 != 0){
				pollocktrue[pollocknum] = 1;
				pollockk.add(pollocknum);
			}
			pollocknum = (i * (i + 1) * (i + 2)) / 6;
		}
		
		for(int i = 0; i < pollockk.size();i++){
			for(int j = 0 ; j < pollocktrue.length; j++){
				if(j + pollockk.get(i) <= 1000000){
					pollocktrue[j + pollockk.get(i)] = Math.min(pollocktrue[j + pollockk.get(i)], pollocktrue[j] + 1); 
				}
			}
			
		}
		for(int i = 0; i < pollock.size();i++){
			for(int j = 0 ; j < pollocktrue2.length; j++){
				if(j + pollock.get(i) <= 1000000){
					pollocktrue2[j + pollock.get(i)] = Math.min(pollocktrue2[j + pollock.get(i)], pollocktrue2[j] + 1); 
				}
			}
			
		}
		
		while(true){
			
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			System.out.println(pollocktrue2[n]+ " "+ pollocktrue[n]);
		}
		
	}

}