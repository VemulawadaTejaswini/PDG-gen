import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		try {
			while(true) {
				str=bfr.readLine();
				if(str=="") {
					System.exit(0);
				}
				int input=Integer.parseInt(str);
				int kurai=0;
				int ichi_kazu=0;
				int tmp=0;
				for(int i=0; i<31; i++) {
					tmp=input>>i;
					if(tmp%2==1) {
						kurai=i+1;
						ichi_kazu++;
					}
				}

				System.out.println(Math.max(kurai-1,ichi_kazu));

			}
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

