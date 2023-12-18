import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str="";
		int sets=0;
		int[] rui=new int[3];
		rui[0]=0;
		rui[1]=0;
		rui[2]=0;
		sets=sc.nextInt();
		String[] stat=new String[5000];
		int outs=0;int counts=0;
		while(outs<3*sets) {
			stat[counts]=sc.next();
			if(stat[counts].equals("OUT")) {
				outs++;
				if(outs==sets*3) {break;}
			}
			counts++;
		}
		int ten=0;
		int ot=0;
		for(int i=0; i<=counts; i++) {
			if(stat[i].equals("HIT")) {
				if(rui[2]==1) {
					ten++;
				}
				rui[2]=rui[1];
				rui[1]=rui[0];
				rui[0]=1;
			}
			else if(stat[i].equals("HOMERUN")) {
				ten++;
				ten+=rui[0];
				ten+=rui[1];
				ten+=rui[2];
				rui[0]=0;
				rui[1]=0;
				rui[2]=0;
			}
			else if(stat[i].equals("OUT")) {
				ot++;
				if(ot==3) {
					System.out.println(ten);
					ot=0;
					ten=0;
					rui[0]=0;
					rui[1]=0;
					rui[2]=0;
				}
			}
			sc.close();
		}
	}
}
