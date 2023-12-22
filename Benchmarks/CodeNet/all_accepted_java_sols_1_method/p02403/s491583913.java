

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
				if(intA[0] == 0 && intA[1] == 0){
					break;
				}else{
					for(int i = 0;i < intA[0];i++){
						for(int j = 0; j < intA[1];j++){
							System.out.print("#");
						}
						System.out.println();
					}
					System.out.println();
				}
			}catch(IOException e){
				e.printStackTrace();
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
		}
	}

}

