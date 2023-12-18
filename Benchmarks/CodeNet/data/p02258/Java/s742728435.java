import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int readNumOfData = Integer.parseInt(in.readLine());
		int[] numArr = new int[readNumOfData];
		int maxPro=0, temp;

		try{
			for(int i=0; i<readNumOfData; i++){
				numArr[i] = Integer.parseInt(in.readLine());
			}

			for(int j=0; j<readNumOfData-1; j++){

				if(j==0){
					maxPro = numArr[j+1] - numArr[j];
					continue;
				}
				temp = numArr[j+1] - numArr[j];
				if(maxPro < temp){
					maxPro = temp;
				}
			}

			System.out.println(maxPro);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}