import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Day = sc.nextInt();//日数
		int clothes = sc.nextInt();//服の数
		int maxtemp[]=new int[Day];//予想最高気温
		int lower[]=new int[clothes];//下限気温
		int upper[]=new int[clothes];//上限気温
		int style[]=new int[clothes];//派手さ
		for(int i=0;i<Day;i++){
			maxtemp[i] = sc.nextInt();
		}
		for(int i=0;i<clothes;i++){
			lower[i] = sc.nextInt();
			upper[i] = sc.nextInt();
			style[i] = sc.nextInt();	
		}
		int guy[][]=new int[Day][clothes];
		int A[]=new int[Day];
		for(int i=0;i<Day;i++){
			int a=0;
			for(int j=0;j<=clothes-1;j++){
				if(lower[j]<=maxtemp[i]&&upper[j]>=maxtemp[i]){
					guy[i][a]=style[j];
					a=a+1;
					}
				if(j==clothes-1){
					A[i]=a;
				}
			}
		}
		int maxabso[]=new int[Day-1];
		int absolutevalue=0;
		for(int i=0;i<Day-1;i++){
			maxabso[i]=0;//0に初期化しておく
		}
		for(int i=0;i<=Day-2;i++){
			for(int j=0;j<A[i];j++){
				for(int k=0;k<A[i+1];k++){
					absolutevalue=guy[i][j]-guy[i+1][k];
					if(absolutevalue<0){
						absolutevalue=(-1)*absolutevalue;
					}
					if(absolutevalue>=maxabso[i]){
						maxabso[i]=absolutevalue;
					}
				}
			}
		}
		int sum=0;
		for(int i=0;i<Day-1;i++){
			sum=sum+maxabso[i];
		}
		System.out.println(sum);
	}
}