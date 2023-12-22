import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		String str="";
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));

		str=bfr.readLine();
		int kaisu=Integer.parseInt(str);
		int[] balls=new int[10];
		int[] case1=new int[10];
		int[] case2=new int[10];
		String[] matome;


		int counter=0;
		int cnt1=0;
		int cnt2=0;
		boolean c1_jun=true;
		boolean c2_jun=true;
		boolean said=false;
		String str1="";
		String str2="";

		for(int h=0; h<kaisu; h++) {
			str=bfr.readLine();
			matome=str.split(" ");
			for(int i=0; i<10; i++) {
				case1[i]=0;
				case2[i]=0;
				balls[i]=Integer.parseInt(matome[i]);
			}
			for(int i=0; i<1024; i++) {
				counter=i;
				for(int j=0; j<10; j++) {
					if(counter%2==0) {
						case1[cnt1]=balls[j];
						cnt1++;
					}

					else if(counter%2==1) {
						case2[cnt2]=balls[j];
						cnt2++;
					}
					counter=counter/2;
				}

				for(int j=1; j<cnt1; j++) {
					if(case1[j-1]<case1[j] && c1_jun==true) {
						c1_jun=true;
					}
					else {
						c1_jun=false;
						break;
					}
				}

				for(int j=1; j<cnt2; j++) {
					if(case2[j-1]<case2[j] && c2_jun==true) {
						c2_jun=true;
					}
					else {
						c2_jun=false;
						break;
					}
				}

				if(c1_jun==true && c2_jun==true) {
					System.out.println("YES");
					said=true;
					c1_jun=true;
					c2_jun=true;
					cnt1=0;
					cnt2=0;
					for(int j=0; j<10; j++) {
						case1[j]=0;
						case2[j]=0;
					}
					break;
				}
				c1_jun=true;
				c2_jun=true;
				cnt1=0;
				cnt2=0;
				for(int j=0; j<10; j++) {
					case1[j]=0;
					case2[j]=0;
				}
			}
			if(said==false)System.out.println("NO");
			said=false;
		}
	}
}
