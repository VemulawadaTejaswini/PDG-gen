import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args)throws IOException {
		
		int num = 1;
		String[] ArrayX;
		int count = 0;
		String A = "0";
		int[] resultArray;
		
		do {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		num = Integer.parseInt(str);
		A = A + (str + " ");
		count++;
		
		}while(num != 0);
		
		ArrayX = A.split(" ");
		resultArray = new int[count];
		
		for(int i=0 ; i<count-1; i++) {
			resultArray[i] = Integer.parseInt(ArrayX[i]);
		}
		
		for(int i=0 ; i<count-1; i++) {
			System.out.println("Case"  +" " + (i+1)  +": " + resultArray[i]);
		}
		
	}
	
}