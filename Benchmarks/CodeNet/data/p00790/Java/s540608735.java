import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			/*
			 * {
			 * Dice dice=new Dice(1,2,3,4,5,6);
			 * dice.rollX();
			 * println(dice.is[0]+"");
			 * dice=new Dice(1,5,3,4,2,6);
			 * dice.rollY();
			 * println(dice.is[0]+"");
			 * dice=new Dice(1,5,3,4,2,6);
			 * dice.rollZ();
			 * println(dice.is[0]+"");
			 * 
			 * }
			 */
			Dice dice=new Dice(1, 2, 3, 4, 5, 6);
			for(int i=0; i<n; i++){
				// news
				// top,northツ猟按つス ,westツづ可つオ
				switch(sc.next().charAt(0)){
				case 'n':
					dice.rollX();
					break;
				case 'e':
					dice.rollY();
					break;
				case 'w':
					dice.rollY();
					dice.rollY();
					dice.rollY();
					break;
				case 's':
					dice.rollX();
					dice.rollX();
					dice.rollX();
					break;
				}
			}
			println(dice.is[0]+"");
		}
	}

	class Dice{
		// top, front, left, right, back, bottom
		int[] is=new int[6];

		Dice(int... is){
			this.is=is;
		}

		void rollX(){
			roll(0, 1, 5, 4);
		}

		void rollY(){
			roll(0, 3, 5, 2);
		}

		void rollZ(){
			roll(1, 3, 4, 2);
		}

		void roll(int a, int b, int c, int d){
			int t=is[d];
			is[d]=is[c];
			is[c]=is[b];
			is[b]=is[a];
			is[a]=t;
		}

		Dice[] rollAll(){
			Dice[] dices=new Dice[24];
			for(int i=0; i<6; i++){
				for(int j=0; j<4; j++){
					dices[i*4+j]=new Dice(is.clone());
					rollZ();
				}
				if((i&1)>0)
					rollX();
				else
					rollY();
			}
			return dices;
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}