import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws Exception{
    	int a,b;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line = br.readLine();
        String[] rArray = line.split(" ");
        a = Integer.parseInt(rArray[0]);
        b = Integer.parseInt(rArray[1]);

        System.out.println(a*b + " " +(a+b)*2);
    }
}