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
				d.tE();
				//System.out.println("E"+d.up);
			}else if(ar[i]=='N'){
				d.tN();
				//System.out.println("N"+d.up);
			}else if(ar[i]=='S'){
				d.tS();
				//System.out.println("S"+d.up);
			}else if(ar[i]=='W'){
				d.tW();
				//System.out.println("W"+d.up);
			}
		}
		System.out.println(num[d.up]);
	}
}

class Dice{
	static int[] label=new int[6];
	Dice(int[] a){
		for(int i=0;i<6;i++){
			label[i]=a[i];
		}
	}
	static int up=0,fr=1,ri=2;
	
	void tE(){
		int t=up;
		up=5-ri;
		ri=t;
	}
	
	void tW(){
		int t=up;
		up=ri;
		ri=5-t;
	}
	
	void tN(){
		int t=up;
		up=fr;
		fr=5-t;
	}
	
	void tS(){
		int t=up;
		up=5-fr;
		fr=t;
	}
}