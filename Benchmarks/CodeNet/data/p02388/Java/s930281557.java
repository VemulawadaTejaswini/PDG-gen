import java.io.*;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
		System.out.print("What is number?:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number_s = br.readLine();
		int number_i = Integer.parseInt(number_s);
                int num = number_i*number_i*number_i;
                System.out.println(num);
        }
}