import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = Integer.parseInt(sc.next()); //Aの値段
		int b = Integer.parseInt(sc.next()); //Bの値段
		int c = Integer.parseInt(sc.next()); //ABの値段
		int d = Integer.parseInt(sc.next()); //Aの枚数
		int e = Integer.parseInt(sc.next()); //Bの枚数
		int ap =0;							//A買う枚数
		int bp =0;							//B買う枚数
		int cp = 0;							//C買う枚数
		if(2*c <= a && 2*c <= b){
			if(d<=e)cp =2*e;
			if(e<d)cp =2*d;
		}else if(2*c <= a){						//A一枚がAB二枚よりも高い場合
			cp =d*2;
			if(d<e)bp =e-d;
		}else if(2*c <= b){					//B一枚がAB二枚よりも高い場合
			cp =e*2;
			if(e<d)ap =d-e;
		}else if(a+b>2*c) {					//A+BがAB二枚よりも高い場合
			if(d>=e) {
				cp=2*e;
				ap=d-e;
			}else if(d<e){
				cp=2*d;
				bp=e-d;
			}
		}else{
			ap=d;
			bp=e;
		}
		System.out.println(ap*a+bp*b+cp*c); 
	}
}
