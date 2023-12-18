import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		Dice2 dice=new Dice2();
		for(int i=0;i<6;i++){
			dice.set(sc.nextInt(),i);
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int u=sc.nextInt();
			int f=sc.nextInt();
			dice.find(u, f);
			System.out.println(dice.get(3));
		}
	}

}
class Dice2 {
	private int d[]=new int[6];
	void set(int a,int i){
			d[i]=a;
	}
	int get(int i){
		return d[i-1];
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
	void find(int u,int f){
		for(int i=0;i<4;i++){
			if(d[1]==f)break;
			roll("N");
		}
		if(d[1]!=f){
			roll("E");
			for(int i=0;i<4;i++){
				if(d[1]==f)break;
				roll("N");
			}
		}
		for(int i=0;i<4;i++){
			if(d[0]==u)break;
			roll("E");
		}
	}
}