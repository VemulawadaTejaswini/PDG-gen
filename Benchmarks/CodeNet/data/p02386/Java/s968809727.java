package bugaisya;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dice2 dice = new Dice2();
		int n = scan.nextInt();
		for(int i = 0 ; i < 6 ; i ++){
			dice.d[i]=scan.nextInt();
		}
		for(int i = 0 ; i < n-1 ; i ++){
			for(int j = 0 ; j < 6 ; j ++){
				dice.d2[j]=scan.nextInt();
			}
			dice.check();
		}
		System.out.println(dice.result);
	}
}
class Dice2{
	public int[] d = new int[6];
	public int[] d2 = new int[6];
	private int temp=0;	
	public String result = "Yes"; 
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
	void check(){
		for(int i = 0 ; i <= 3 ; i ++){
			if(checkAll()){
				break;
			}
			N();
			for(int j = 0 ; j <= 3 ; j ++){
				if(checkAll()){
					break;
				}
				R();
			}
		}
		for(int j = 0 ; j <= 3 ; j ++){
			if(checkAll()){
				break;
			}
			W();
			for(int i = 0 ; i <= 3 ; i ++){
				if(checkAll()){
					break;
				}
				R();
			}
		}
		if(Arrays.equals(d,d2)){
			result="No";
		}
	}
	boolean checkAll(){
		if(d[0] == d2[0] && d[1] == d2[1] && d[2] == d2[2] &&
				d[3] == d2[3] && d[4] == d2[4] && d[5] == d2[5]){
			return true;
		}
		return false;
	}
}