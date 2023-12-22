import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=0;
		int sosuko=0;
		long wa=0l;
		int genzai=0;
		boolean ss=false;
		while(sc.hasNext()) {
			input=sc.nextInt();
			sosuko=0;
			wa=0l;
			genzai=0;

			if(input>=1) {
				wa+=2;
				genzai=2;
				sosuko=1;
			}
			if(input==0) {
				System.exit(0);
			}
			genzai=3;
			while(input>sosuko) {
				ss=true;
				for(int j=2; j<=Math.sqrt(genzai)+1;) {
					if(genzai%j==0) {
						genzai+=2;
						ss=false;
						break;
					}
					j++;
				}
				if(ss==true) {
					wa+=genzai;
					sosuko++;
					genzai+=2;
				}
			}
			System.out.println(wa);
		}
	}
}
