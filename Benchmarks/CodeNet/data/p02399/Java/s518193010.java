import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        	String strArr[] = br.readLine().split(" ");
            int a=Integer.parseInt(strArr[0]);
            int b=Integer.parseInt(strArr[1]);

            System.out.println(a/b +" "+a%b+" "+(String.format("%.5f",((double)a)/((double)b))));

    }
}