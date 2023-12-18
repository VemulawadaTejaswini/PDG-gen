import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		Dice dice=new Dice();
		for(int i=0;i<6;i++){
			dice.set(sc.nextInt(),i);
		}
		dice.roll(sc.next());
		System.out.println(dice.get(1));
	}

}
class Dice {
	int d[]=new int[6];
	void set(int a,int i){
			d[i]=a;
	}
	void roll(String s){
		for(int i=0;i<s.length();i++){
			int temp=d[0];
			switch(s.charAt(i)) {
			case 'N':
				d[0]=d[1];
				d[1]=d[5];
				d[5]=d[4];
				d[4]=temp;
				break;
			case 'S':
				d[0]=d[4];
				d[4]=d[5];
				d[5]=d[1];
				d[1]=temp;
				break;
			case 'E':
				d[0]=d[3];
				d[3]=d[5];
				d[5]=d[2];
				d[2]=temp;
				break;
			case 'W':
				d[0]=d[2];
				d[2]=d[5];
				d[5]=d[3];
				d[3]=temp;
				break;
			}
		}
	}
	int get(int i){
		return d[i-1];
	}
}