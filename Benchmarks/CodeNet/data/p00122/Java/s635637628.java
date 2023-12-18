
import java.util.Scanner;

public class Main {

	static int[][] field;
	static int[] v1={-1,0,1,2,2,2,1,0,-1,-2,-2,-2};
	static int[] v2={-2,-2,-2,-1,0,1,2,2,2,1,-1,0};
	static int[] v3={-1,0,1,1,1,0,-1,-1};
	static int[] v4={-1,-1,-1,0,1,1,1,0};
	static int n;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int a=cin.nextInt();
			int b=cin.nextInt();
			if(a+b==0)break;
			field=new int[10][10];
			n = cin.nextInt();
			for(int i=0;i<n;i++){
				int c=cin.nextInt();
				int d=cin.nextInt();
				field[c][d]+=1<<(i);
				for(int j=0;j<v3.length;j++){
					int cc=c+v3[j];
					int dd=d+v4[j];
					if(cc<0||dd<0||cc>9||dd>9)continue;
					field[cc][dd]+=1<<(i);
				}
			}
//			output();
			if(bt(1,a,b)){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");
			}
		}
	}
	static void output(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.printf("%5d",field[i][j]);
			}
			System.out.println();
		}
	}
	static boolean bt(int step,int c,int d){
		if(step==1<<(n))return true;
//		System.out.println(step+" "+c+" "+d+" "+field[c][d]);
		for(int j=0;j<v1.length;j++){
			int cc=c+v1[j];
			int dd=d+v2[j];
			if(cc<0||dd<0||cc>9||dd>9)continue;
//			System.out.println("   "+cc+" "+dd+" "+field[cc][dd]);
//			System.out.println("   "+Integer.toBinaryString(field[cc][dd])+" "+Integer.toBinaryString(step)+" "+(field[cc][dd]&step));
			if((field[cc][dd]&step)>0){
				if(bt(step<<1,cc,dd)){
					return true;
				}				
			}

		}
		return false;
	}
}