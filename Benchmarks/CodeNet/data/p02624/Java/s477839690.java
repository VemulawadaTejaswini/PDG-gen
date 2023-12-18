import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
int[] date=new int[n];
int[] dat=new int[n];
for(o=1;o<=n;o++) {
	for(m=1;m<=o;m++) {
		as=o%m;
		if(as==0) {
			kl=kl+1;
		}
	}
	date[o-1]=kl;
	kl=0;
}
for(o=1;o<=n;o++) {
	dat[o-1]=o*date[o-1];
	hun=dat[o-1]+hun;
	//System.out.println(dat[o-1]);
	//System.out.println(date[o-1]);
}
System.out.println(hun);
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}