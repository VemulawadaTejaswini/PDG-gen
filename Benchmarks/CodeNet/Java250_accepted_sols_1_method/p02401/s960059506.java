import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		String op=st.nextToken();
		int b=Integer.parseInt(st.nextToken());
		int c=0;

		if(op.equals("+")) {
			c=a+b;
		}else if(op.equals("-")) {
			c=a-b;
		}else if(op.equals("*")) {
			c=a*b;
		}else if(op.equals("/")) {
			c=a/b;
		}

		while(!op.equals("?")) {
			System.out.println(c);

			StringTokenizer sa=new StringTokenizer(br.readLine());
			a=Integer.parseInt(sa.nextToken());
			op=sa.nextToken();
			b=Integer.parseInt(sa.nextToken());

			if(op.equals("+")) {
				c=a+b;
			}else if(op.equals("-")) {
				c=a-b;
			}else if(op.equals("*")) {
				c=a*b;
			}else if(op.equals("/")) {
				c=a/b;
			}

		}

	}

}

