
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
				int i = 0;
				for(i = 0;i < strA.length ;i++){
					intA[i] = Integer.parseInt(strA[i]);
				}
				int intDiv = 0;
				if(intA[0] == 0 && intA[1] == 0){
					break;
				}else{
					for(i = 0;i < intA[0];i++){
						intDiv = i % 2;
						if(intDiv == 0){
							for(int j = 0; j < intA[1];j++){
								intDiv = j % 2;
								if(intDiv == 0){
									System.out.print("#");
								}else{
									System.out.print(".");
								}

							}
						}else{
							for(int j = 0; j < intA[1];j++){
								intDiv = j % 2;
								if(intDiv == 1){
									System.out.print("#");
								}else{
									System.out.print(".");
								}

							}
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

