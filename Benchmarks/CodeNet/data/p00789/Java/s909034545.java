import java.util.*;
public class Main{
	public static void main(String[] args) {
		int data[] = new int[18];
		for(int i=0;i<18;i++){
			data[i]=i*i;
		}
		int num[] = new int[301];//カウント
		for(int i=0;i<300;i++)num[i]=0;//全て0
		num[0]=1;
		for(int s=1;s<18;s++){//全ての場合
			for(int i=data[s];i<301;i++){//倍数ずつ進む
				if((i-s*s)>=0){
					num[i]+=num[i-data[s]];
				}
			}
		}
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			System.out.println(num[n]);
		}
	}
}