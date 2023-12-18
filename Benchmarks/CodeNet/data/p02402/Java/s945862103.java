import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line1 = reader.readLine();
			int n = Integer.parseInt(line1);//1stLine
			String line2 = reader.readLine();//2ndLine
			String[] sarray = line2.split(" ", -1);
			int[] num = new int[n];
			for(int i = 0; i < n; i++){
				num[i] = Integer.parseInt(sarray[i]);
			}
			
			int min = 0;//min number
			int p = 0;
			while(min < n - 1 && p < n - 1){
				p++;
				if(num[min] > num[p]){
					min = p;
				}
			}
			
			int max = 0;//max number
			int q = 0;
			while(max < n - 1 && q < n - 1){
				q++;
				if(num[max] < num[q]){
					max = q;
				}
			}
			
			long sum[] = new long[n + 1]; //sum long
			long value[] = new long[n];
			for(int j = 0; j < n; j++){
				value[j] = num[j]; //int to long
			}
			sum[0] = 0;
			for(int k = 1; k <= n; k++){
				sum[k] = value[k - 1] + sum[k - 1];
			}
			
			System.out.println(num[min] + " " + num[max] + " " + sum[n]);
		} catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}