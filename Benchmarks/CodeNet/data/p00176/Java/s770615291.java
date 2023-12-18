import java.util.Scanner;
import java.lang.Math;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		int iff = Integer.decode("0xff");
		int[][] a = new int[8][];
		
		for(int i = 0; i < 8; i++){
			a[i] = new int[3];
		}
		a[1][2] = a[2][1] = a[3][1] = a[3][2] = a[4][0] = a[5][0] = iff;
		a[5][2] = a[6][0] = a[6][1] = a[7][0] = a[7][1] = a[7][2] = iff;
		
		while(true){
			String str = sc.next();
			if(str.equals("0")){
				break;
			}
			int r = Integer.decode("0x"+str.substring(1, 3));
			int g = Integer.decode("0x"+str.substring(3, 5));
			int b = Integer.decode("0x"+str.substring(5, 7));
			
			double mind = Math.sqrt((double)(r*r+g*g+b*b));
			int p = 0;
			
			for(int i = 1; i < 8; i++){
				double d = Math.sqrt((double)((r-a[i][0])*(r-a[i][0])+(g-a[i][1])*(g-a[i][1])+(b-a[i][2])*(b-a[i][2])));
				if(d < mind){
					mind = d;
					p = i;
				}
			}
			
			if(p == 0){
				str = "black";
			} else if(p == 1){
				str = "blue";
			} else if(p == 2){
				str = "lime";
			} else if(p == 3){
				str = "aqua";
			} else if(p == 4){
				str = "red";
			} else if(p == 5){
				str = "fuchsia";
			} else if(p == 6){
				str = "yellow";
			} else {
				str = "white";
			}
			
			System.out.println(str);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}