import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] num = new int[6];
		for(int i=0;i<6;i++){
			num[i]=sc.nextInt();
		}
		Dice1 d = new Dice1(num);
		int q=sc.nextInt();
		int un=0,fn=0;
		for(int i=0;i<q;i++){
			int u=sc.nextInt();
			for(int j=0;j<6;j++){
				if(num[j]==u){
					un=j;
					break;
				}
			}
			int f=sc.nextInt();
			for(int j=0;j<6;j++){
				if(num[j]==f){
					fn=j;
					break;
				}
			}
			System.out.println(num[d.rcheck(un, fn)]);
		}
	}
}

class Dice1{
	static int[] label=new int[6];
	Dice1(int[] a){
		for(int i=0;i<6;i++){
			label[i]=a[i];
		}
	}
	int rcheck(int up,int fr){
		int a=0;
		if(up==0){
			if(fr==1){
				a=2;
			}else if(fr==2){
				a=4;
			}else if(fr==3){
				a=1;
			}else if(fr==4){
				a=3;
			}
		}else if(up==1){
			if(fr==0){
				a=3;
			}else if(fr==2){
				a=0;
			}else if(fr==3){
				a=5;
			}else if(fr==5){
				a=2;
			}
		}else if(up==2){
			if(fr==0){
				a=1;
			}else if(fr==1){
				a=5;
			}else if(fr==4){
				a=0;
			}else if(fr==5){
				a=4;
			}
		}else if(up==3){
			if(fr==0){
				a=4;
			}else if(fr==1){
				a=0;
			}else if(fr==4){
				a=5;
			}else if(fr==5){
				a=1;
			}
		}else if(up==4){
			if(fr==0){
				a=2;
			}else if(fr==2){
				a=5;
			}else if(fr==3){
				a=0;
			}else if(fr==5){
				a=3;
			}
		}else if(up==5){
			if(fr==1){
				a=3;
			}else if(fr==2){
				a=1;
			}else if(fr==3){
				a=4;
			}else if(fr==4){
				a=2;
			}
		}
		return a;
	}
}