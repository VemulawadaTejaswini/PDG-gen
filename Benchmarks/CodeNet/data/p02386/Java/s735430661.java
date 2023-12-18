import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean or=true;
		int n=sc.nextInt();
		int[][] num = new int[n][6];
		for(int j=0;j<n;j++){
			for(int i=0;i<6;i++){
				num[j][i]=sc.nextInt();
			}
		}
		Dice3[] d = new Dice3[n];
		for(int i=0;i<n;i++){
			d[i]=new Dice3(num[i]);
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				//System.out.println("check"+check(d[i],d[j]));
				if(check(d[i],d[j])){
					System.out.println("///"+i+" "+j);
					or=false;
					break;
				}
			}
			if(!or){
				break;
			}
		}
		if(or){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	static boolean check(Dice3 d1,Dice3 d2){
		int up=-1,fr=-1;
		boolean yn=true;
		for(int i=0;i<6;i++){
			//System.out.println(d1.label[0]+"/"+d2.label[i]);
			if(d1.label[0]==d2.label[i]){
				up=i;
				break;
			}
		}
		if(up<0){
			yn=false;
		}
		for(int i=0;i<6;i++){
			//System.out.println(d1.label[1]+"/"+d2.label[i]);
			if(d1.label[1]==d2.label[i]){
				fr=i;
				break;
			}
		}
		//System.out.println(d1.label[0]+" 0 "+d2.label[up]);
		//System.out.println(d1.label[1]+" 1 "+d2.label[fr]);
		if(fr<0){
			yn=false;
		}
		//System.out.println(d2.label[rcheck(up, fr)]+" 2 "+d1.label[2]);
		if(d2.label[rcheck(up, fr)]!=d1.label[2]){
			yn=false;
		}
		//System.out.println(d2.label[5-rcheck(up, fr)]+" 3 "+d1.label[3]);
		if(d2.label[5-rcheck(up, fr)]!=d1.label[3]){
			yn=false;
		}
		//System.out.println(d2.label[5-fr]+" 4 "+d1.label[4]);		
		if(d2.label[5-fr]!=d1.label[4]){
			yn=false;
		}
		//System.out.println(d2.label[5-up]+" 5 "+d1.label[5]);
		if(d2.label[5-up]!=d1.label[5]){
			yn=false;
		}
		return yn;
	}
	static int rcheck(int up,int fr){
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

class Dice3{
	int[] label=new int[6];
	Dice3(int[] a){
		for(int i=0;i<6;i++){
			label[i]=a[i];
		}
	}
}