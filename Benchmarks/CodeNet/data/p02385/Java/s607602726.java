import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		String[] line = sc.nextLine().split(" ");
		for(int i=0;i<6;i++){
			num[i]=Integer.parseInt(line[i]);
		}
		Dice dice=new Dice(num);
		line=sc.nextLine().split(" ");
		for(int i=0;i<6;i++){
			num[i]=Integer.parseInt(line[i]);
		}
		Dice dice2 = new Dice(num);

		int upper = dice2.getUpper();
		int s = dice2.getS();
             
		if(dice.getLower()==s){
			dice.moveN();
		}else if(dice.getN()==s){
			dice.moveN();
			dice.moveN();
		}else if(dice.getE()==s){
			dice.moveE();
			dice.moveN();
		}else if(dice.getW()==s){
			dice.moveW();
			dice.moveN();
		}else if(dice.getUpper()==s){
			dice.moveS();
		}
             
		if(dice.getLower()==upper){
			dice.moveW();
			dice.moveW();
		}else if(dice.getW()==upper){
			dice.moveE();
		}else if(dice.getE()==upper){
			dice.moveW();
		}
		
		if(dice.getLower()==dice2.getLower() && dice.getUpper()==dice2.getUpper()&&
			dice.getN()==dice2.getN() && dice.getE()==dice2.getE()&&
			dice.getS()==dice2.getS() && dice.getW()==dice2.getW()){
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
		lavel1=i[0];
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