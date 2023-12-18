import java.util.Scanner;
public class Main{
	int o,h,s,e;
	double q,w,a;
	String  i,l,k;
	Scanner scan=new Scanner(System.in);
	public void output() {
int[] date=new int[4];
for(o=0;o<4;o++) {
	date[o]=scan.nextInt();
}
while(true) {
	if(date[0]!=0) {
		date[3]-=date[0];
		if(date[3]>=date[0]) {
		h=date[0];
		}else {
			h=date[3];
		}
		date[0]=0;
		if(date[3]<=0) {
			break;
		}
	}else if(date[1]!=0) {
		date[3]-=date[1];
		date[1]=0;
		if(date[3]<=0) {
			break;
		}
	}else if(date[2]!=0) {
		s=date[3]-date[2];
		date[3]-=date[2];
		
	if(s<0) {
		h-=date[3];
	}
		date[2]=0;
	if(date[3]<=0) {
		break;
	}
	}
	
}
System.out.println(h);
	}
	public static void main(String[] args) {
		Main p=new Main();
		p.output();
	}
}