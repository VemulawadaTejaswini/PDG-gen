import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			Highest3 h3 = new Highest3();
			for(int i=0;i<10;i++){
				int a=Integer.parseInt(sc.next());
				h3.renew(a);
			}
			for(int i=0;i<3;i++)System.out.println(h3.get(i));
		}
	}
}
class Highest3{
	private int[] height=new int[3];
	Highest3(){
		for(int i=0;i<3;i++)this.height[i]=0;
	}
	public void renew(int height){
		int[] h4= new int[4];
		for(int i=0;i<3;i++)h4[i]=this.height[i];
		h4[3]=height;
		Arrays.sort(h4);
		for(int i=0;i<3;i++)this.height[i]=h4[3-i];
	}
	public int get(int i){
		return this.height[i];
	}
}