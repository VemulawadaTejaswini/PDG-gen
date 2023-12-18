import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int n = Integer.parseInt(buf);
			int i = 1;
			CHECK_NUM(i,n,0);
			System.exit(0);

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public static void CHECK_NUM(int i,int n,int x)
	{
		x=i;

		if(x % 3==0){
			System.out.print(" "+i);
			END_CHECK_NUM(i,n,x);
		}

		INCLUDE3(i,n,x);
	}

	public static void INCLUDE3(int i,int n,int x)
	{
		if ( x % 10 == 3 ){ //xを10で割ったとき余りが3の時は
			System.out.print(" "+i);
			END_CHECK_NUM(i,n,x);
		}
		x /= 10;
		//System.out.print(" x="+x);
		if ( x != 0 ) INCLUDE3(i,n,x);

		END_CHECK_NUM(i,n,x);
	}

	public static void END_CHECK_NUM(int i,int n,int x)
	{
		if ( ++i <= n )	CHECK_NUM(i,n,x);

		System.out.println();
		System.exit(0);
	}
}