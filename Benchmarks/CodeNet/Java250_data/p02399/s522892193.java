import java.io.*;

public class Main{
public static void main(String[] args){
try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	int a = Integer.parseInt(str[0]);
	int b = Integer.parseInt(str[1]);

	int d = a / b;
	int r = a % b;
	double f = (double) a / (double) b;
	
	System.out.printf("%d %d %.5f\n", d, r, f);

}catch(IOException e){
System.out.println(e);
}
}
}