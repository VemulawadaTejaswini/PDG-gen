import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] a) throws IOException {
		int set,i,j;
		int s1,s2,s3;
		int[] array = new int[3];
		String[] stock = new String[3];
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String Input = in.readLine();

		set = Integer.parseInt(Input);

		for(i = 0;i < set;i++){
			Input = in.readLine();
			stock = Input.split(" ");

			for(j = 0;j < 3;j++)
				array[j] = Integer.parseInt(stock[j]);
			
			Arrays.sort(array);

			if(Math.pow(array[0],2) + Math.pow(array[1],2) == Math.pow(array[2],2)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
    }
}