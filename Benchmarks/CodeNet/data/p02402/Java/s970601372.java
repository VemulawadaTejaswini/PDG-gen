import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int kosu = Integer.parseInt(str);
		int[] Array = new int[kosu]; 
		String[] ArrayX = new String[kosu];
		
		BufferedReader bw =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = bw.readLine();
		ArrayX = str1.split(" ");
		
		for(int i=0; i<kosu; i++) {
			Array[i] = Integer.parseInt(ArrayX[i]);
		}
		
		int maxNum = 0;
		int minNum = Array[0];
		int sumNum = 0;
		
		for (int i = 0; i< Array.length;i++){
			maxNum = Math.max(maxNum, Array[i]);
			minNum = Math.min(minNum, Array[i]);
			sumNum = sumNum + Array[i];
		}
		System.out.println(maxNum + " " + minNum + " " + sumNum);
	}
}