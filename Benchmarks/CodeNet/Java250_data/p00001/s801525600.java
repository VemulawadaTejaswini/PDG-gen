import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		try{
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			int[] num = new int[10];
			for(int i=0;i<10;i++){
				num[i] = Integer.parseInt(stdReader.readLine());
			}
			Arrays.sort(num);
			System.out.println(num[9]);
			System.out.println(num[8]);
			System.out.println(num[7]);
		}catch(Exception e){
			}
		}
}