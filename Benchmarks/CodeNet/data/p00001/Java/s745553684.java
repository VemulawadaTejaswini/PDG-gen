import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		int[] height = {0,0,0};
		int newh;
		;
		for(int cnt = 0;cnt<10;cnt++){
			newh = sc.nextInt();
			height = Calc.calc(newh, height);
		};
		System.out.println(height[0]);
		System.out.println(height[1]);
		System.out.println(height[2]);
	}
}

class Calc{
	//private static final int imax = 110;
	public static int[] calc(int h, int[] Pastheight){
		int Newheight[] = (int[])Pastheight.clone();
		if( (h > Pastheight[2]) && (h <= Pastheight[1])){
			Newheight[2] = h;
		}else if((h > Pastheight[1]) && (h <= Pastheight[0])){
			Newheight[1] = h;
			Newheight[2] = Pastheight[1];
		}else if(h > Pastheight[0]){
			Newheight[0] = h;
			Newheight[1] = Pastheight[0];
			Newheight[2] = Pastheight[1];
		}
	return Newheight;
	}
}