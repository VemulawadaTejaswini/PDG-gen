import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] N = new int[6];
			for(int i=0;i<6;i++)N[i]=Integer.parseInt(sc.next());
		String order = sc.next();
		char[] charOrder = order.toCharArray();
		Dice dice = new Dice(N);
		
		for(char c: charOrder)dice.roll(c);
		

		System.out.println(dice.getNow());

		sc.close();
	}

}

class Dice{
	private int[] roll=new int[6];
	private int[] nowRoll= new int[6];
	Dice(int[] N){
		for(int i = 0;i<6;i++){
			this.roll[i]=N[i];
			this.nowRoll[i]=N[i];
		}
	}

	public int getNow(){
		return nowRoll[0];
	}

	public void roll(char c){
		//int dir;
		int[] tmpRoll=new int[6];
		for(int i=0;i<6;i++)tmpRoll[i]=this.nowRoll[i];

		if(c=='E'){
			this.nowRoll[0]=tmpRoll[3];
			//this.nowRoll[1]=tmpRoll[1];
			this.nowRoll[2]=tmpRoll[0];
			this.nowRoll[3]=tmpRoll[5];
			//this.nowRoll[4]=tmpRoll[4];
			this.nowRoll[5]=tmpRoll[2];
		}
		if(c=='N'){
			this.nowRoll[0]=tmpRoll[1];
			this.nowRoll[1]=tmpRoll[5];
			//this.nowRoll[2]=tmpRoll[2];
			//this.nowRoll[3]=tmpRoll[3];
			this.nowRoll[4]=tmpRoll[0];
			this.nowRoll[5]=tmpRoll[4];
		}
		if(c=='S'){
			this.nowRoll[0]=tmpRoll[4];
			this.nowRoll[1]=tmpRoll[0];
			//this.nowRoll[2]=tmpRoll[2];
			//this.nowRoll[3]=tmpRoll[3];
			this.nowRoll[4]=tmpRoll[5];
			this.nowRoll[5]=tmpRoll[1];
		}
		if(c=='W'){
			this.nowRoll[0]=tmpRoll[2];
			//this.nowRoll[1]=tmpRoll[1];
			this.nowRoll[2]=tmpRoll[5];
			this.nowRoll[3]=tmpRoll[0];
			//this.nowRoll[4]=tmpRoll[4];
			this.nowRoll[5]=tmpRoll[3];
		}

	}

}