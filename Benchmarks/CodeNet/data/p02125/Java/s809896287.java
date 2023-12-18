import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		try {
			str=bfr.readLine();
			if(str=="") {
				System.exit(0);
			}
			int input=Integer.parseInt(str);

			int bki2=1;
			int f=0;


			for(int i=0; i<31; i++) {
				if(input>bki2) {
					bki2*=2;
					f=i;
				}
				if(input<=bki2) {
					break;
				}
			}
			System.out.println((f+1));
		} catch (IOException e) {
			System.exit(0);
		}
		catch(NumberFormatException e) {
			System.exit(0);
		}

		catch(NullPointerException e) {
			System.exit(0);
		}
	}
}

