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
	
	private static boolean isEdge(int x, int y, int index){
		if(x == 0 || x == (height.get(index) - 1)){
			return true;
		}
		else if(y == 0 || y == (width.get(index) - 1)){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static String selectLetter(int x, int y, int index){
		if(isEdge(x, y, index)){
			return "#"; 
		}
		else{
			return ".";
		}
	}
	
	private static void drawRectangle(int index){
		int h = height.get(index);
		int w = width.get(index);
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.printf(selectLetter(i, j, index));
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void drawAllRectangle(){
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