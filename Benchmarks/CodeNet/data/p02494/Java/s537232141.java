import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scaner=new Scanner(System.in);
		while(scaner.hasNext()){
			String a[]=scaner.nextLine().split(" ");
			drawRect(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
			if(scaner.hasNext())System.out.print('\n');
		}
	}
	
	static void drawRect(int h,int w){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print("#");
			}
			System.out.print('\n');
		}
	}

}