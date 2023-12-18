import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		String moto="";
		String[] ipt;
		int[] dist=new int[10];
		int den1_sp=0,den2_sp=0;
		double deai=0;
		int kyori=0;
		int ruikei=0;
		int yotei=0;
		while(sc.hasNext()) {
			moto=sc.next();
			if(moto=="") {
				System.exit(0);
			}
			ipt=moto.split(",");
			for(int i=0; i<10; i++) {
				dist[i]=Integer.parseInt(ipt[i]);
				kyori+=dist[i];
			}
			den1_sp=Integer.parseInt(ipt[10]);
			den2_sp=Integer.parseInt(ipt[11]);
			deai=((double)den1_sp*kyori)/((double)(den1_sp+den2_sp));

			yotei=dist[0];
			for(int i=0; i<10; i++) {
				if((deai-ruikei)>0.00000001 && (yotei-deai)>0.00000001) {
					System.out.println(i+1);
					break;
				}

				else if(Math.abs(ruikei-deai)<0.0000001) {
					System.out.println(i);
					break;
				}
				yotei+=dist[i+1];
				ruikei+=dist[i];

			}
			yotei=0;
			ruikei=0;
			kyori=0;
			sc=new Scanner(System.in);
		}
	}
}
