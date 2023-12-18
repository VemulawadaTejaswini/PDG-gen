import java.io.*;
public class Main{  
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String txt1 = reader.readLine();
			int x = Integer.parseInt(txt1);
			int num;
			num = x * x * x;
			System.out.println(num);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}