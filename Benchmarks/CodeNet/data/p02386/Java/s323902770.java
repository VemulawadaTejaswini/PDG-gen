import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int n =Integer.parseInt(sc.nextLine());
		Dice[] dice = new Dice[n];
		boolean flag=true;
		
		for(int i=0;i<n;i++){
			String[] line = sc.nextLine().split(" ");
			for(int j=0;j<6;j++){
				num[j]=Integer.parseInt(line[j]);
			}
			dice[i]=new Dice(num);
		}
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
			int upper = dice[i].getUpper();
			int s = dice[i].getS();
			
			if(dice[j].getLower()==s){
				dice[j].moveN();
			}else if(dice[j].getN()==s){
				dice[j].moveN();
				dice[j].moveN();
			}else if(dice[j].getE()==s){
				dice[j].moveE();
				dice[j].moveN();
			}else if(dice[j].getW()==s){
				dice[j].moveW();
				dice[j].moveN();
			}else if(dice[j].getUpper()==s){
				dice[j].moveS();
			}
             
			if(dice[j].getLower()==upper){
				dice[j].moveW();
				dice[j].moveW();
			}else if(dice[j].getW()==upper){
				dice[j].moveE();
			}else if(dice[j].getE()==upper){
				dice[j].moveW();
			}
			
			if(dice[j].getLower()==dice[i].getLower() && dice[j].getUpper()==dice[i].getUpper()&&
				dice[j].getN()==dice[i].getN() && dice[j].getE()==dice[i].getE()&&
				dice[j].getS()==dice[i].getS() && dice[j].getW()==dice[i].getW()){
			}else{
				flag=false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
class Dice{
//
	private final int lavel1,lavel2,lavel3,lavel4,lavel5,lavel6;
	private int w,s,e,n;
	private int upper,lower;
//	
	Dice(int[] i){
		lavel1=i[j];
		lavel2=i[1];
		lavel3=i[2];
		lavel4=i[3];
		lavel5=i[4];
		lavel6=i[5];
		
		w=lavel4;
		s=lavel2;
		e=lavel3;
		n=lavel5;
		
		upper=lavel1;
		lower=lavel6;
	}
	
	public int getUpper(){
		return upper;
	}
	public int getW(){
		return w;
	}
	public int getS(){
		return s;
	}
	public int getE(){
		return e;
	}
	public int getN(){
		return n;
	}
	public int getLower(){
		return lower;
	}
	
	public void moveW(){
		int i=lower;
		lower=w;
		w=upper;
		upper=e;
		e=i;
	}
	public void moveS(){
		int i=lower;
		lower=s;
		s=upper;
		upper=n;
		n=i;
	}
	public void moveE(){
		int i=lower;
		lower=e;
		e=upper;
		upper=w;
		w=i;
	}
	public void moveN(){
		int i=lower;
		lower=n;
		n=upper;
		upper=s;
		s=i;
	}
}