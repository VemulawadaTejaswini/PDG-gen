import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int h = a.nextInt();
		int w = a.nextInt();
		
		for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}