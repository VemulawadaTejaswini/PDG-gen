import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		String str[];
        int a,b,answer = 0;
        String operator;
        StringBuilder builder = new StringBuilder();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
	        str = br.readLine().split(" ");
	        a = Integer.parseInt(str[0]);
	        operator = str[1];
	        b = Integer.parseInt(str[2]);

	        if(operator.equals("?"))break;
	        else if(operator.equals("+")) answer = a + b;
	        else if(operator.equals("/")) answer = a / b;
	        else if(operator.equals("-")) answer = a - b;
	        else if(operator.equals("*")) answer = a * b;

	        builder.append(answer + "\n");
        }
        builder.delete(builder.length() - 1, builder.length());
        System.out.println(builder.toString());

        br.close();
	}
}