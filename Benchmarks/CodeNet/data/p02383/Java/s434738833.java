import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		for(int i = 0 ; i < 6 ; i ++){
			dice.d[i]=scan.nextInt();
		}
		String str = scan.next();
		for(int i = 0 ; i < str.length() ; i ++){
			char operation = str.charAt(i);
			switch(operation){
				case 'N':
					dice.N();
					break;
				case 'S':
					dice.S();
					break;
				case 'W':
					dice.W();
					break;
				case 'E':
					dice.E();
					break;
			}
		}
		System.out.println(dice.d[0]);
	}
}
class Dice{
	public int[] d = new int[6];
	private int temp=0;	
	void N(){
		temp=d[0];
		d[0]=d[1];
		d[1]=d[5];
		d[5]=d[4];
		d[4]=temp;
	}
	void S(){
		temp=d[0];
		d[0]=d[4];
		d[4]=d[5];
		d[5]=d[1];
		d[1]=temp;
	}
	void E(){
		temp=d[0];
		d[0]=d[3];
		d[3]=d[5];
		d[5]=d[2];
		d[2]=temp;
	}
	void W(){
		temp=d[0];
		d[0]=d[2];
		d[2]=d[5];
		d[5]=d[3];
		d[3]=temp;
	}
}