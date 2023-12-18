import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		int num = Integer.parseInt(br.readLine());
		int []intGroup = new int[3*num];
		String []group = br.readLine().split(" ");
		int j = 0;
		for(String s: group) {
			intGroup[j] = Integer.parseInt(s);
			j++;
		}
		Arrays.sort(intGroup);
		int len = intGroup.length-2;
		long result = 0;
		for(int i = 0;i<num;i++) {
			result += intGroup[len];
			len -=2;
		}
		System.out.println(result);
	}
}