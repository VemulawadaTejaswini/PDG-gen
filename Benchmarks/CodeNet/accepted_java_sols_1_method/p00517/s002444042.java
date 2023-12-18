import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,c=0,ky=0,hn,wn,hw,hns,wns,bhw;
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		
		int [][] p =new int [n][2];
		
		
		
		
		for(i=0;i<n;i++){
			int hp  =sc.nextInt();
			p[i][0]=hp;
			int wp =sc.nextInt();
			p[i][1]=wp;
			
		}
		
		int [] nex=new int [2];
		
		
		for(i=1;i<n;i++){
			hn=p[i-1][0]-p[i][0];
			wn=p[i-1][1]-p[i][1];
			hns=hn;
			wns=wn;
			if(hn<0) hns=hn*-1;
			if(wn<0) wns=wn*-1;
			
			ky=hns+wns;
			
			if(hns>wns) hw=wns;
			else hw = hns;
			
			if((hn>0&&wn>0)|| (hn<0&&wn<0)){
					ky-=hw;
			}
			c+=ky;
			
		}
		
		
		System.out.printf("%d\n",c);
		sc.close();
		System.exit(0);
	}
}