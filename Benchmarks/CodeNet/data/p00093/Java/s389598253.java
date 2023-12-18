import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String temp = null;
		while(!(temp = sc.readLine()).equals("0 0")){
			String[] str = temp.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			if(a == 0 & b == 0) break;
			int count = 0;
			for(int i = a; i <= b; i++){
				if(judge(i)){
					System.out.println(i);
					count++;
				}
			}
			if(count == 0) System.out.println("NA");
			System.out.println();
		}
	}
	static boolean judge(int i){
		if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
			return true;
		}else{
			return false;
		}
	}
}