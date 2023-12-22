import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		String str,dataSet[];
		int i,j,total,count = 1;
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		while((str = input.readLine()) != null){
			dataSet = str.split(" ");
			i = Integer.parseInt(dataSet[0]);
			j = Integer.parseInt(dataSet[1]);
			total = i+j;
			while((total /= 10) >= 1){
				count++;
				//System.out.println("total = " + total);
			}
			System.out.println(count);
			count = 1;
		}
	}
}