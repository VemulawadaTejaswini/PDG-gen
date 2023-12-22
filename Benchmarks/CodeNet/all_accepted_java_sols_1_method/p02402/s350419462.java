import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
try {
    long sum =0;
    int min =1000000;
    int max =-1000000;
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

	String input1 = buf.readLine();	
	int count = Integer.parseInt(input1);
	
	String input2 = buf.readLine();
	String[] strAry = input2.split(" ");
	
	for (int i = 0; i < count; i++) {
    int x = Integer.parseInt(strAry[i]);
    sum = sum + x;
    if(x < min){ min = x;}
    if(x > max){ max = x;}
	}
	System.out.println(min + " " + max + " " + sum);
} catch (Exception e) {

	System.out.println("????????????");
	
}
		 }
    }