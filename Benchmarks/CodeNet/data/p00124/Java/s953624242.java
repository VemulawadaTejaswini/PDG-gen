import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			int team_su=sc.nextInt();
			if(team_su==0) {
				break;
			}
			else {
				String[] kuni=new String[team_su];
				int[] kachiten=new int[team_su];
				int[] id=new int[team_su];
				for(int i=0; i<team_su; i++) {
					kuni[i]=sc.next();
					kachiten[i]=sc.nextInt()*3+sc.nextInt()*0+sc.nextInt();
					id[i]=i;
				}

				int tmp1=0,tmp2=0;
				int tmp3=0,tmp4=0;
				String a="",b="";

				for(int i=0; i<team_su; i++) {
					for(int j=i; j<team_su; j++) {
						if(kachiten[i]<kachiten[j]) {
							tmp1=kachiten[i];
							tmp2=kachiten[j];
							a=kuni[i];
							b=kuni[j];
							tmp3=id[i];
							tmp4=id[j];
							kachiten[i]=tmp2;
							kachiten[j]=tmp1;
							kuni[i]=b;
							kuni[j]=a;
							id[i]=tmp4;
							id[j]=tmp3;
						}

						if(kachiten[i]==kachiten[j]) {
							tmp3=id[i];
							tmp4=id[j];
							if(tmp3>tmp4) {
								tmp1=kachiten[i];
								tmp2=kachiten[j];
								a=kuni[i];
								b=kuni[j];
								kachiten[i]=tmp2;
								kachiten[j]=tmp1;
								kuni[i]=b;
								kuni[j]=a;
								id[i]=tmp4;
								id[j]=tmp3;
							}
						}
					}
				}
				for(int i=0; i<team_su; i++) {
					System.out.println(kuni[i]+","+kachiten[i]);
				}
			}
		}
	}
}
