import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		for(int i = 0 ; i < 6 ; i ++){
			dice.d[i]=scan.nextInt();
		}
		int n = scan.nextInt();
		while(n--!=0){
			int top = scan.nextInt();
			int front = scan.nextInt();
			System.out.println(dice.getRight(top, front));
		}
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
	void R(){
		temp=d[1];
		d[1]=d[2];
		d[2]=d[4];
		d[4]=d[3];
		d[3]=temp;
	}
	int getRight(int t, int f){
		for(int i = 0 ; i < 3 ; i ++){
			if(t == d[0]){
				break;
			}
			N();
			if(t == d[0]){
				break;
			}
			W();
		}for(int i = 0 ; i < 3 ; i ++){
			if(f == d[1]){
				break;
			}
			R();
		}
		return d[2];
		
	}
}