import java.util.Arrays;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	double nd(){
		return sc.nextDouble();
	}
	
	void io(){
		sc=new Scanner (System.in);
		
		int[][] num=new int[4][2];
		for(int[] e:num)Arrays.fill(e,0);
		int side=0;
		
		while(sc.hasNext()){
			double eye=nd();
			if(eye>=1.1) ++num[0][side];
			else if(eye>=0.6) ++num[1][side];
			else if(eye>=0.2) ++num[2][side];
			else ++num[3][side];
			side^=1;
		}
		for(int i=0;i<4;++i)System.out.println(num[i][0]+" "+num[i][1]);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}
}