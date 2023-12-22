import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		int ary[]= new int[3];
		for (int i=0;i<=2;++i){
			ary[i]= sc.nextInt();
		}
		int a,b;

		for ( int i =1;i>=0;--i){
		if (ary[i+1]<ary[i]){
			a=ary[i];
			b=ary[i+1];
			ary[i]=b;
			ary[i+1]=a;
		}
		}
		if (ary[2]<ary[1]){
			a=ary[1];
			b=ary[2];
			ary[1]=b;
			ary[2]=a;
		}
		System.out.println(ary[0]+" "+ary[1]+" "+ary[2]);
	}
}
