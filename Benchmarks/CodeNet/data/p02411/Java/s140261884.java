
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
				String[] strA = insBR.readLine().split(" ");
				int[] intA = new int[strA.length];
				for(int i = 0;i < strA.length ;i++){
					intA[i] = Integer.parseInt(strA[i]);
				}
				int intTest = 0;
				if(intA[0] == -1 || intA[1] ==-1){
					intTest = intA[0] + intA[1] + 1;
				}else{
					intTest = intA[0] + intA[1];
				}
				String strRecord = "";
				if(intA[0] == -1 && intA[1] == -1 && intA[2] == -1){
					break;
				}else if(intA[0] == -1 || intA[1] == -1){
					strRecord = "F";
				}else if(80 <= intTest){
					strRecord = "A";
				}else if(65 <= intTest && intTest < 80){
					strRecord = "B";
				}else if(50 <= intTest && intTest < 65){
					strRecord = "C";
				}else if(30 <= intTest && intTest < 50){
					if(50 <= intA[2]){
						strRecord = "C";
					}else{
						strRecord = "D";
					}
				}else {
					strRecord = "F";
				}
				System.out.println(strRecord);
			}catch(IOException e){
				e.printStackTrace();
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
		}
	}
}

