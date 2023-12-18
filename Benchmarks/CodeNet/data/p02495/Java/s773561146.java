import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> height = new ArrayList<Integer>();
	private static ArrayList<Integer> width = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		getInput();
		drawAllRectangle();
	}
	
	private static void getInput() {
		//"0 0"が入力されるまで入力を受け取る
		while(sc.hasNextLine()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(! ((h == 0) && (w == 0)) ){
				height.add(h);
				width.add(w);
			}
			else{
				break;
			}
		}
	}
	
	private static String selectLetter(boolean flag){
		if(flag){
			return "#"; 
		}
		else{
			return ".";
		}
	}
	
	private static void drawRectangle(int index){
		int h = height.get(index);
		int w = width.get(index);
		boolean isPound = true;
		int line = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.printf(selectLetter(isPound));
				isPound = !(isPound);
			}
			System.out.println();
			if( ((++line) % 2) == 1){
				isPound = false;
			}
		}
		System.out.println();
	}

	private static void drawAllRectangle(){
		//高さと幅の入力された数が同じなら図形を出力する
		int sumRectangle = height.size();
		if(sumRectangle == width.size()){
			for(int i = 0; i < sumRectangle; i++){
				drawRectangle(i);
			}
		}
		else{
			System.out.println("高さと幅の入力された数が異なります");
		}
	}
}