import java.util.*;
public class Main {
	public static void main(String[] args){
		//10=0
		//11=1
		add(0,1,11);
		cpr(10,11,11);
		
		//20-29=temp
		
		//100-131=2^x
		one(100);
		for(int i=0;i<32;i++){
			dbl(100+i,100+i+1);
		}
		
		//200-231=a by 2
		//300-331=pa by 2
		zro(20);
		zro(21);
		for(int i=31;i>=0;i--){
			sbs(20,21);
			inc(100+i,21);
			ecr(21,0,100+i);
			sbs(100+i,200+i);
			for(int j=0;j<i;j++){
				dbl(200+i);
			}
			inc(200+i,20);
		}

		//300-331=b by 2
		//400-431=pb by 2
		zro(20);
		zro(21);
		for(int i=31;i>=0;i--){
			sbs(20,21);
			inc(300+i,21);
			ecr(21,1,300+i);
			sbs(300+i,400+i);
			for(int j=0;j<i;j++){
				dbl(400+i);
			}
			inc(400+i,20);
		}
		//500-563 answer
		zro(20);
		for(int i=0;i<32;i++){
			for(int j=0;j<32;j++){
				and(100+i,300+j,20);
				inc(20,500+i+j);
			}
		}
		zro(20);
		for(int i=0;i<64;i++){
			for(int j=0;j<i;j++){
				dbl(500+i);
			}
			inc(500+i,20);
		}
		sbs(20,2);
	}
	//30-39 system temp
	public static void add(int i,int j,int k){
		System.out.println("+ "+i+" "+j+" "+k);
	}
	public static void inc(int i,int j){
		add(j,i,j);
	}
	public static void inc(int i){
		add(i,11,i);
	}
	public static void sbs(int i,int j){
		add(i,10,j);
	}
	public static void zro(int i){
		sbs(10,i);
	}
	public static void one(int i){
		sbs(11,i);
	}
	public static void dbl(int i,int j){
		add(i,i,j);
	}

	public static void dbl(int i){
		dbl(i,i);
	}

	public static void cpr(int i,int j,int k){
		System.out.println("< "+i+" "+j+" "+k);
	}
	
	public static void cpl(int i,int j,int k){
		cpr(j,i,k);
	}
	
	public static void equ(int i,int j,int k){
		cpr(i,j,30);
		cpl(i,j,31);
		//30-31=equtemp
		add(30,31,30);
		cpr(30,11,k);
	}
	public static void ecr(int i,int j,int k){
		cpr(i,j,30);
		cpl(i,j,31);
		add(30,31,31);
		cpr(31,11,31);
		add(30,31,k);
	}
	public static void ecl(int i,int j,int k){
		cpr(i,j,30);
		cpl(i,j,31);
		add(30,31,30);
		cpr(30,11,30);
		add(30,11,k);
	}
	public static void and(int i,int j,int k){
		add(i,j,32);
		//32=logictemp
		cpr(11,32,k);
	}
	public static void orr(int i,int j,int k){
		add(i,j,32);
		cpr(10,32,k);
	}
}