import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	while(true){
        	String strArr[] = br.readLine().split(" ");
            int a=Integer.parseInt(strArr[0]);
            String op=strArr[1];
            int b=Integer.parseInt(strArr[2]);

            if(op.equals("+")){
            	System.out.println(a+b);
            }

            else if(op.equals("-")){
            	System.out.println(a-b);
            }

            else if(op.equals("*")){
            	System.out.println(a*b);
            }

            else if(op.equals("/")){
            	System.out.println(a/b);
            }

            else if(op.equals("?")){
            	System.exit(0);
            }

            op="";
            a=0;
            b=0;
    	}
    }
}