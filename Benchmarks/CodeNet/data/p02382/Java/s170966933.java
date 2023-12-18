import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] su1 = new int[num];
		int[] su2 = new int[num];
		String[] str1 = br.readLine().split(" ");

		for(int i = 0; i < str1.length; i++){
			su1[i] = Integer.parseInt(str1[i]);
		}

		String[] str2 = br.readLine().split(" ");

		for(int i = 0; i < str2.length; i++){
			su2[i] = Integer.parseInt(str2[i]);
		}
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double infinity = 0;

		for(int i = 0; i < num; i++){
			p1 += Math.abs(su1[i] - su2[i]);
			p2 += Math.abs(Math.pow(su1[i] - su2[i],2));
			p3 += Math.abs(Math.pow(su1[i] - su2[i],3));
			if(infinity < Math.abs(su1[i]-su2[i])){
				infinity = Math.abs(su1[i] - su2[i]);
			}
		}
		System.out.println(p1);
		System.out.println(Math.sqrt(p2));
		System.out.println(Math.cbrt(p3));
		System.out.println(infinity);
	}
}