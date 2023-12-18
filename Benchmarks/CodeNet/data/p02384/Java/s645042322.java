import java.util.Scanner;
class Dice{
	private int num[] = new int[6];
	private int we[] = new int[4];
	private int ns[] = new int[4];
	public Dice(){
	}
	public void setNum(int n[]){
		for(int i = 0 ; i < 6 ; i++)
			num[i] = n[i];
		we[0] = ns[3] = num[5];
		we[2] = ns[1] = num[0];
		we[1] = num[3];
		we[3] = num[2];
		ns[0] = num[4];
		ns[2] = num[1];
	}
	public void setNum(int n1, int n2, int n3, int n4, int n5, int n6){
		int N1=n1, N2=n2, N3=n3, N4=n4, N5=n5, N6=n6;
		we[2] = ns[1] = num[0] = N1;
		ns[2] = num[1] = N2;
		we[3] = num[2] = N3;
		we[1] = num[3] = N4;
		ns[0] = num[4] = N5;
		we[0] = ns[3] = num[5] = N6;
	}
	public int getNum(int i, int n){
		if(i == 0)
			return we[n];
		else
			return ns[n];
	}
	public void print(int i, int n){
		if(i == 0)
			System.out.println(we[n]);
		else 
			System.out.println(ns[n]);
	}
	public void roll(String order){
		for(int i = 0 ; i < order.length() ; i++){
			switch(order.charAt(i)){
				case 'E' : setNum(num[3],num[1],num[0],num[5],num[4],num[2]); break;
				case 'W' : setNum(num[2],num[1],num[5],num[0],num[4],num[3]); break;
				case 'S' : setNum(num[4],num[0],num[2],num[3],num[5],num[1]); break;
				case 'N' : setNum(num[1],num[5],num[2],num[3],num[0],num[4]); break;
			}
		}
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		for(int i = 0 ; i < 6 ; i++)
			num[i] = sc.nextInt();
		Dice dice = new Dice();
		dice.setNum(num);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			int up = sc.nextInt();
			int forward = sc.nextInt();
			for(int j = 0 ; j < 4 ; j++)
			{
				dice.roll("N");
				if(forward == dice.getNum(1,2))
					break;
			}
			if(forward != dice.getNum(1,2))
			{
				dice.roll("W");
				for(int j = 0 ; j < 4 ; j++)
				{
					dice.roll("N");
					if(forward == dice.getNum(1,2))
						break;
				}
			}
			for(int j = 0 ; j < 4 ; j++)
			{
				dice.roll("W");
				if(up == dice.getNum(0,2))
					break;
			}
			dice.print(0,3);
		}
	}
}
