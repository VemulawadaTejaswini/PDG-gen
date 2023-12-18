import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
	int a[][]=new int[4][2];
	a[0][0]=scan.nextInt()*8;
	a[1][0]=scan.nextInt()*4;
	a[2][0]=scan.nextInt()*2;
	a[3][0]=scan.nextInt();
	a[0][1]=1;
	a[1][1]=2;
	a[2][1]=3;
	a[3][1]=4;
	Arrays.sort(a, (c, b) -> Integer.compare(c[0], b[0]));
	double n=scan.nextInt();
	long ans=0;
	//case1→0.25ℓ 2→0.5ℓ 3→1ℓ 4→2ℓ
	switch(a[0][1]) {
	case 1:
		ans+=(long)(long)a[0][0]/8*(int)(n/0.25);
		System.out.println(ans);
		return;
	case 2:
		if(n>=0.5) {
			ans+=(long)(long)a[0][0]/4*(int)(n/0.5);
			n-=((int)n/0.5)*0.5;
		}
		break;
	case 3:
		if(n>=1) {
			ans+=(long)(long)a[0][0]/2*(int)(n/1);
			n-=((int)n/1)*1;
		}
		break;
	case 4:
		if(n>=2) {
			ans+=(long)(long)a[0][0]*(int)(n/2);
			n-=((int)n/2)*2;
		}break;
	}
	switch(a[1][1]) {
	case 1:
		ans+=(long)(long)a[1][0]/8*(int)(n/0.25);
		System.out.println(ans);
		return;
	case 2:
		if(n>=0.5) {
			ans+=(long)(long)a[1][0]/4*(int)(n/0.5);
			n-=((int)n/0.5)*0.5;
		}
		break;
	case 3:
		if(n>=1) {
			ans+=(long)a[1][0]/2*(int)(n/1);
			n-=((int)n/1)*1;
		}
		break;
	case 4:
		if(n>=2) {
			ans+=(long)a[1][0]*(int)(n/2);
			n-=((int)n/2)*2;
		}break;
	}
	switch(a[2][1]) {
	case 1:
		ans+=(long)a[2][0]/8*(int)(n/0.25);
		System.out.println(ans);
		return;
	case 2:
		if(n>=0.5) {
			ans+=(long)a[2][0]/4*(int)(n/0.5);
			n-=((int)n/0.5)*0.5;
		}
		break;
	case 3:
		if(n>=1) {
			ans+=(long)a[2][0]/2*(int)(n/1);
			n-=((int)n/1)*1;
		}
		break;
	case 4:
		if(n>=2) {
			ans+=(long)a[2][0]*(int)(n/2);
			n-=((int)n/2)*2;
		}break;
	}
	switch(a[3][1]) {
	case 1:
		ans+=(long)a[3][0]/8*(int)(n/0.25);
		System.out.println(ans);
		return;
	case 2:
		if(n>=0.5) {
			ans+=(long)a[3][0]/4*(int)(n/0.5);
			n-=((int)n/0.5)*0.5;
		}
		break;
	case 3:
		if(n>=1) {
			ans+=(long)a[3][0]/2*(int)(n/1);
			n-=((int)n/1)*1;
		}
		break;
	case 4:
		if(n>=2) {
			ans+=(long)a[3][0]*(int)(n/2);
			n-=((int)n/2)*2;
		}break;
	}
	System.out.println(n);
}
}