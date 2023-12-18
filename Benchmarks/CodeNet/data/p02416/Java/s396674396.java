import java.io.*;
 
class Main{
    public static void main(String[] args)throws IOException{
		long sum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			sum = 0;
			String str = br.readLine();
			long num = Long.parseLong(str);
			if(num == 0){
				break;
			}
			while(num >= 1){
				sum += num % 10;
				num = num / 10;
			}
			System.out.println(sum);
		}
    }
}