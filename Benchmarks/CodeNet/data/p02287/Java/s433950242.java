import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	int H;
	int[] Array;

	public void input() {
		H = sc.nextInt();
		Array = new int[H+1];
		for(int i=1; i<=H; i++) {
			Array[i] = sc.nextInt();
		}
	}
	
	public void output() {
		int index;
		for(int i=1; i<H+1; i++) {
			output.append("node ").append( Integer.toString(i) );
			output.append(": key = ").append( Integer.toString(Array[i]) ).append(", ");
			//親がいるかどうかの判定
			index = i/2;
			if( !(index < 1) ) {output.append("parent key = ").append( Integer.toString(Array[index]) ).append(", ");}
			//左の子を持つかの判定
			index = 2 * i;
			if( !(index > H) ) {output.append("left key = ").append( Integer.toString(Array[index]) ).append(", ");}
			//右の子を持つかの判定
			index = 2 * i + 1;
			if( !(index > H) ) {output.append("right key = ").append( Integer.toString(Array[index]) ).append(", ");}
			output.append("\n");
		}
		System.out.print( output.toString() );
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

