import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] num = new int[6];
		int up=0;
		for(int i=0;i<6;i++){
			num[i]=sc.nextInt();
		}
		Dice d = new Dice(num);
		String or=sc.next();
		char[] ar = or.toCharArray();
		for(int i=0;i<or.length();i++){
			if(ar[i]=='E'){
				up = d.tE(up);
			}else if(ar[i]=='N'){
				up=d.tN(up);
			}else if(ar[i]=='S'){
				up=d.tS(up);
			}else if(ar[i]=='W'){
				up=d.tW(up);
			}
		}
		System.out.println(num[up]);
	}
}

class Dice{
	static int[] label=new int[6];
	Dice(int[] a){
		for(int i=0;i<6;i++){
			label[i]=a[i];
		}
	}
	int tE(int up){
		int a=up;
		if(up==0||up==1||up==4||up==5){
			a=3;
		}else if(up==2){
			a=0;
		}else if(up==3){
			a=5;
		}
		return a;
	}
	int tN(int up){
		int a=up;
		if(up==0||up==2||up==3||up==5){
			a=1;
		}else if(up==1){
			a=5;
		}else if(up==4){
			a=0;
		}
		return a;
	}
	int tS(int up){
		int a=up;
		if(up==0||up==2||up==3||up==5){
			a=4;
		}else if(up==1){
			a=0;
		}else if(up==4){
			a=5;
		}
		return a;
	}
	int tW(int up){
		int a=up;
		if(up==0||up==1||up==4||up==5){
			a=2;
		}else if(up==2){
			a=5;
		}else if(up==3){
			a=0;
		}
		return a;
	}
}