import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
 {
	public static void main(String[] a) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int i=0;
        while(i<=200){
        String str = br.readLine();
        String num_str[]=new String[2];
        num_str=str.split(" ");
        int sum=Integer.parseInt(num_str[0])+Integer.parseInt(num_str[1]);
        System.out.println(Integer.toString(sum).length());
        i++;
        }
    }
}