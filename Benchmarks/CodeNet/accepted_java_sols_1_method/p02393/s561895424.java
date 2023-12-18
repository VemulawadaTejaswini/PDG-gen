import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		//3????????´??°a,b,c?????\???
		String[] num = str.split(" ");

		Arrays.sort(num);
		System.out.println(num[0]+" "+num[1]+" "+num[2]);
	}
}