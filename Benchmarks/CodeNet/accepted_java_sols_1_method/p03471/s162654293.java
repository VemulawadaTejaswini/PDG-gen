import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int maisu=sc.nextInt();
		int kin=sc.nextInt();
		int h[]=new int[3];
		for(int i=0;i<3;i++) {
			h[i]=-1;
		}
		for(int i=0;i<=maisu;i++) {
			for(int j=0;j<=maisu;j++) {
				if(10000*i+j*5000+1000*(maisu-i-j)==kin&&i+j<=maisu) {
					h[0]=i;
					h[1]=j;
					h[2]=maisu-i-j;
					i=maisu+1;
					j=maisu+1;
				}
			}
		}
		System.out.print(h[0]+" "+h[1]+" "+h[2]);


	}

}