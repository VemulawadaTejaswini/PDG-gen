import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		int[] month=new int[12];
		int youbi=3;		// 2004 1 1 ha mokuyoubi    nichiyoubi 0
		int nissuu=0;
		String str="";
		StringTokenizer stk;
		int tsuki=0,nichi=0;
		int motomeru=0;
		month[0]=31;
		month[1]=29;
		month[2]=31;
		month[3]=30;
		month[4]=31;
		month[5]=30;
		month[6]=31;
		month[7]=31;
		month[8]=30;
		month[9]=31;
		month[10]=30;
		month[11]=31;

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				nissuu=0;
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");
				tsuki=Integer.parseInt(stk.nextToken());
				nichi=Integer.parseInt(stk.nextToken());
				if(tsuki==0 && nichi==0) {
					System.exit(0);
				}
				if(tsuki==1) {
					nissuu=nichi;
				}
				else {
					for(int i=0; i<=tsuki-2; i++) {
						nissuu+=month[i];
					}
					nissuu+=nichi;
				}

				motomeru=(youbi+nissuu)%7;

				if(motomeru==0) {
					System.out.println("Sunday");
				}
				else if(motomeru==1) {
					System.out.println("Monday");
				}
				else if(motomeru==2) {
					System.out.println("Tuesday");
				}
				else if(motomeru==3) {
					System.out.println("Wednesday");
				}
				else if(motomeru==4) {
					System.out.println("Thursday");
				}
				else if(motomeru==5) {
					System.out.println("Friday");
				}
				else if(motomeru==6) {
					System.out.println("Saturday");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
