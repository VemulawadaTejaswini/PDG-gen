import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		int[] result = new int[114514];
		int count=0;
		while((str=br.readLine().split(",")) != null){
			if(check(Double.parseDouble(str[1]), Double.parseDouble(str[2]))){
				result[count] = Integer.parseInt(str[0]);
				count++;
			}
		}
		if(result.length==0){
			System.out.println("該当なし");
		}
		else
			for(Integer a : result){
				System.out.println(result);
			}
			
	}
	public static boolean check(double kg, double m){
		double bmi = kg/(m*m);
		if(bmi>25)
			return true;
		else
			return false;
	}
}