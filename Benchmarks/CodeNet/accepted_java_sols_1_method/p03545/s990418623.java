import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int[] abya=new int[4];
		int[] ope= {1,-1};
		String[] kig= {"+","-"};
		int sum=0;
		String ala="";

		for(int i=0; i<4; i++) {
			abya[i]=Integer.parseInt(a.charAt(i)+"");
		}
		for(int i=0; i<8; i++) {
			ala="";
			sum=0;
			sum+=abya[0];
			ala=ala+abya[0]+"";
			for(int j=1; j<4; j++) {
				sum+=ope[(i>>(j-1))%2]*abya[j];
				ala=ala+kig[(i>>(j-1))%2]+""+abya[j];
			}
			if(sum==7) {
				System.out.println(ala+"=7");
				System.exit(0);
			}
		}
	}
}