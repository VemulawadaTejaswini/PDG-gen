import java.io.IOException;
import java.util.Scanner;
class Main{
	
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num[] =new int[times];
		mathClass keisan =new mathClass();
		for(int i=0; i<times;i++){
			num[i] = scan.nextInt();
		}
//		int[] nouse = keisan.shellSort(num, times);
		int[] nouse = new int[times];
		nouse = keisan.shellSort(num,times);
		keisan.disp(nouse);


	}
}
class mathClass{
	static int cnt = 0;
	public mathClass(){
		
	}
	//?????????????????????????????????
	public int[] insertSort(int[] A,int n,int g){
		for(int i=g ;i<n;i++){
			int v = A[i];
			int j = i-g;
			while(j>=0 && A[j]>v){
				A[j+g] = A[j];
				j = j - g;
				cnt ++;
			}
			A[j+g] = v;
		}
//		System.out.println("cnt is "+cnt);
		return A;
	}
	//?????§?????????????????????
	public int[] shellSort(int[] A,int n){
		mathClass keisan =new mathClass();
		cnt = 0;
		int[] ret = A.clone();
		int importG[]  = new int[100];
		int tm =0;
		for(int i=1; i<n; i=3*i+1){
			importG[tm] = i;
//			System.out.println("G is "+importG[tm]);
			tm++;
		}
		System.out.println("tm is "+tm);
		int G[] = new int [tm];
		
		for(int i=0;i<tm;i++){
			
			G[i] = importG[tm-1-i];
//			System.out.println("ireru "+importG[i]);
		}
		int m = G.length;//??????G?????????
		keisan.disp2(m,G);
		
		for(int i=0;i<m;i++){
			ret = keisan.insertSort(A, n, G[i]);
			
		}
		return ret;
	}
	//???????????¨???
	public void disp(int[] ary){
		System.out.println(cnt);
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
	}
	public void disp2(int m,int[] ary){
		System.out.println(m);
		for(int i=0;i<ary.length;i++){
			
			System.out.print(ary[i]);
			if(i == ary.length-1){
				System.out.println();
			}
			else{
				System.out.print(" ");
			}

		}
	}
}