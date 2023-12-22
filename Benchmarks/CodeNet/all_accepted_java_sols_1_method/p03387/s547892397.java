import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();

		int max,mid,min;
		max=0;
		mid=0;
		min=0;
		
		if(A>=B && B>=C){
			max=A;
			mid=B;
			min=C;
		}else if(A>=C && C>=B){
			max=A;
			mid=C;
			min=B;
		}else if(B>=A && A>=C){
			max=B;
			mid=A;
			min=C;
		}else if(B>=C && C>=A){
			max=B;
			mid=C;
			min=A;
		}else if(C>=A && A>=B){
			max=C;
			mid=A;
			min=B;
		}else if(C>=B && B>=A){
			max=C;
			mid=B;
			min=A;
		}
		int count=0;
		int dif=((max - mid) + (max - min));
		int dn=mid-min;
		if(dn%2==0){
			count = dn/2 + (max-mid);
		}else if(dif%2 ==0){
			count=dif/2;
		}else{
			count=1+((mid+1)-min)/2 + (max - mid);
		}
		
		System.out.println(count);
	}
}