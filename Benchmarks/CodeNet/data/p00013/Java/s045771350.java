import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{

	public static void main(String[] a){

		while(true) {
			int[] syaryouko=new int[100];		//densya no tamariba
			int[] deteiku =new int[100];		//syuturyoku

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String sc;
			try {
				sc = br.readLine();
				if(sc==null) {
					System.exit(0);
				}
				int input=Integer.parseInt(sc);
				syaryouko[99]=input;
				int daisuu=1;
				int counter=98;		//tugini ireru syaryouko	syaryouko
				int deteiku_counter=0;	// deteikudensya no hairetu no are

				for(int i=0; i!=daisuu;) {
					sc=br.readLine();
					if(sc==null) {
						System.exit(0);
					}
					input=Integer.parseInt(sc);

					if(input!=0) {
						syaryouko[counter]=input;
						counter--;
						daisuu++;
					}
					else if(input==0) {
						deteiku[deteiku_counter]=syaryouko[counter+1];
						syaryouko[counter]=0;
						System.out.println(deteiku[deteiku_counter]);
						deteiku_counter++;
						counter++;
						i++;
					}
				}

			} catch (IOException e) {

				System.exit(0);
			}

		}
	}

}

// imi fumei no runtime error
