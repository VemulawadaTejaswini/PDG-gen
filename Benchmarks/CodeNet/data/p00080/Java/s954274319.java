import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int input=0;
		double ans=0;
		try {
			while(true) {
				str=bfr.readLine();
				input=Integer.parseInt(str);
				if(input<0) {
					System.exit(0);
				}
				ans=(double)input;
				ans=kotae(ans/2,input);
				System.out.println(ans);
			}
		}catch(IOException e) {
		}
	}

	public static double kotae(double a,int b) {		//a 漸化式のこう　b3乗したあたい
		double newans=0;
		double bb=(double) b;

		newans=a-(a*a*a-bb)/(3*a*a);

		if(Math.abs(newans*newans*newans-bb)<0.00001*bb) {
			return newans;
		}
		else {
			newans=kotae(newans,b);
		}

		return newans;
	}
}
