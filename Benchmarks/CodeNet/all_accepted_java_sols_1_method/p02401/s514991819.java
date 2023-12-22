import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
    	
    	try{
    		InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String buf = br.readLine();
				StringTokenizer st=new StringTokenizer(buf," ");

				int a = Integer.parseInt(st.nextToken());
				String op = st.nextToken();
				int b = Integer.parseInt(st.nextToken());

				if(op.equals("?"))	break;

				if(0 <= a && a<=20000 && 0 <= b && b<=20000){

					if( op.equals("+") ){
						System.out.printf("%d\n",a+b);

					}else if( op.equals("-") ){
						System.out.printf("%d\n",a-b);

					}else if( op.equals("*") ){
						System.out.printf("%d\n",a*b);

					}else if( op.equals("/") ){
						System.out.printf("%d\n",a/b);

					}
				}
			}
    	} catch(IOException e) {
    		System.err.println(e);
		}
    }
}