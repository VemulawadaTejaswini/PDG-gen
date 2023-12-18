import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scaner=new Scanner(System.in);
		String str;
		while((str=scaner.nextLine())!=null){
			String a[]=str.split(" ");
			drawRect(Integer.parseInt(a[0]),Integer.parseInt(a[0]));
			System.out.print('\n');
		}
	}
	
	static void drawRect(int h,int w){
		for(int i=0;i<h;i++){
			for(int j=w;j<w;j++){
				System.out.print('#');
			}
			System.out.print('\n');
		}
	}

}