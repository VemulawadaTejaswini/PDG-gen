import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	private ArrayList<Integer> height;
	private ArrayList<Integer> width;
	
	PrintRectangle(){
		this.sc = new Scanner(System.in);
		this.height = new ArrayList<Integer>();
		this.width = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		PrintRectangle printRectangle = new PrintRectangle();
		printRectangle.getInput();
		printRectangle.drawAllRectangle();
	}
	
	private void getInput() {
		while(this.sc.hasNextLine()){
			int h = this.sc.nextInt();
			int w = this.sc.nextInt();
			
			if(! ((h == 0) && (w == 0)) ){
				this.height.add(h);
				this.width.add(w);
			}
			else{
				break;
			}
		}
	}

	private void drawRectangle(int index){
		int h = this.height.get(index);
		int w = this.width.get(index);
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void drawAllRectangle(){
		int sumRectangle = this.height.size();
		if(sumRectangle == this.width.size()){
			for(int i = 0; i < sumRectangle; i++){
				drawRectangle(i);
			}
		}
		else{
			System.out.println("高さと幅の入力された数が異なります");
		}
	}
}