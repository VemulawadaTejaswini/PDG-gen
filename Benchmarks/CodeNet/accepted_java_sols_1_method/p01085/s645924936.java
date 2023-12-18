import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int ninzu=0;
		int p_min=0;
		int p_max=0;
		int[] tens;
		int diff=0;

		while(true) {
			ninzu=sc.nextInt();
			p_min=sc.nextInt();
			p_max=sc.nextInt();

			if(ninzu*p_min*p_max==0) {
				System.exit(0);
			}
			tens=new int[ninzu];

			for(int i=0; i<ninzu; i++) {
				tens[i]=sc.nextInt();
			}
			int diftn=0;
			int tmpd=0;
			int sontoki=0;
			for(int i=p_min; i<=p_max; i++) {
				tmpd=tens[i-1]-tens[i];
				if(tmpd>=diftn) {
					diftn=tmpd;
					sontoki=i;
				}
			}
			System.out.println(sontoki);
		}
	}
}
