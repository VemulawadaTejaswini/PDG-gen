import java.io.*;
public class Main{  
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String txt1 = reader.readLine();
			int a = Integer.parseInt(txt1);
			String txt2 = reader.readLine();
			int b = Integer.parseInt(txt2);
			int num;
			int sum;
			num = a * b;
			sum = (a * 2) + (b * 2);
			System.out.println(num + " " + sum);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}