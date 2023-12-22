import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int impt=0;
		int beki_max=0;
		int keka=0;
		int moto=0;
		int keka_max=0;

		try {
			str=bfr.readLine();
			if(str.equals("")) {
				System.exit(0);
			}
			impt=Integer.parseInt(str);
			if(impt<=3) {
				System.out.println("1");
				System.exit(0);
			}
			if(impt==1000) {
				System.out.println("1000");
				System.exit(0);
			}
			beki_max=(int) ((Math.log(impt) / Math.log(2)));


			for(int i=2; i<=beki_max; i++) {
				keka=((int)Math.pow(impt,(double)1/i));

				moto=keka;
				for(int j=1; j<i; j++) {
					keka=keka*moto;
				}
				//System.out.println(keka);
				if(keka_max<keka && keka<=impt) {
					keka_max=keka;
				}
			}
			System.out.println(keka_max);
		}catch(IOException e) {

		}
		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}

	}
}