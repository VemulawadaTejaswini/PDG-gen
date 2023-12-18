import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] a) throws Exception {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input;
    	int x;
	int b;
	int sum;

    	while((input = br.readLine().split("\\s")) != null){
    		x = Integer.parseInt(input[0]);
    		b = Integer.parseInt(input[1]);
    		sum = x+b;

    		String str = String.valueOf(sum);
    		System.out.println(str.length());
    		sum =0;
    	}
    }
}