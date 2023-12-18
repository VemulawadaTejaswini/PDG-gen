import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int battery = Integer.parseInt(tmpArray[0]);
			int motor = Integer.parseInt(tmpArray[1]);
			int cable = Integer.parseInt(tmpArray[2]);
			
			if(battery == 0 && motor == 0 && cable == 0){
				break;
			}
			
			int n = Integer.parseInt(br.readLine());
			
			int[] conditionB = new int[battery];
			int[] conditionM = new int[motor];
			int[] conditionC = new int[cable];
			
			final int UNKNOWN = 0;
			final int OK = 1;
			final int BROKEN = 2;
			
			int[][] input = new int[n][4];
			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");
				input[i][0] = Integer.parseInt(tmpArray[0]) - 1;
				input[i][1] = Integer.parseInt(tmpArray[1]) - battery - 1;
				input[i][2] = Integer.parseInt(tmpArray[2]) - battery - cable - 1;
				input[i][3] = Integer.parseInt(tmpArray[3]);
			}
			
			while(true){
				int change = 0;
				
				for(int i = 0; i < n; i++){
					//System.out.println("i = "+i);
					//?¢?????????¨??¨OK?????´???
					if(input[i][3] == 1 && (conditionB[input[i][0]] == UNKNOWN || conditionM[input[i][1]] == UNKNOWN  || conditionC[input[i][2]] == UNKNOWN )){
						conditionB[input[i][0]] = OK;
						conditionM[input[i][1]] = OK;
						conditionC[input[i][2]] = OK;
						change++;
					}
					//?¢??????????????????¢??????
					if(input[i][3] == 0 && conditionB[input[i][0]] == UNKNOWN && conditionM[input[i][1]] == OK && conditionC[input[i][2]] == OK ){
						conditionB[input[i][0]] = BROKEN;
						change++;
					}
					//?¢?????????¢??????????????¢??????
					if(input[i][3] == 0 && conditionB[input[i][0]] == OK && conditionM[input[i][1]] == UNKNOWN && conditionC[input[i][2]] == OK ){
						conditionM[input[i][1]] = BROKEN;
						change++;
					}
					//?¢?????????±??????????????¢??????
					if(input[i][3] == 0 && conditionB[input[i][0]] == OK && conditionM[input[i][1]] == OK && conditionC[input[i][2]] == UNKNOWN ){
						conditionC[input[i][2]] = BROKEN;
						change++;
					}
					
					//System.out.println("change "+change);
				}
				
				if(change == 0){
					break;
				}
			}
			
			for(int i = 0; i < battery ; i++){
				if(conditionB[i] == BROKEN){
					System.out.println(0);
				}
				else if(conditionB[i] == OK){
					System.out.println(1);
				}
				else if(conditionB[i] == UNKNOWN){
					System.out.println(2);
				}
			}
			
			for(int i = 0; i < motor ; i++){
				if(conditionM[i] == BROKEN){
					System.out.println(0);
				}
				else if(conditionM[i] == OK){
					System.out.println(1);
				}
				else if(conditionM[i] == UNKNOWN){
					System.out.println(2);
				}
			}	
			
			for(int i = 0; i < cable ; i++){
				if(conditionC[i] == BROKEN){
					System.out.println(0);
				}
				else if(conditionC[i] == OK){
					System.out.println(1);
				}
				if(conditionC[i] == UNKNOWN){
					System.out.println(2);
				}
			}
		}
	}

}