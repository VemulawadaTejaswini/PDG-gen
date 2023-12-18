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
			String ai_IS_nekama="ai1333";

			for(int i=0; i<input/100; i++) {
				ai_IS_nekama+="3";
			}
			System.out.println(ai_IS_nekama);
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

