import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		int height=stdIn.nextInt();
		int width=stdIn.nextInt();
		
		String [] s=new String[height];
		
			for(int i=0;i<height;i++){
				s[i]=stdIn.next();
			}
		
		
		char[][] c=new char[height][width];
		
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				c[i][j]=s[i].charAt(j);
			}
		}
		for(int i=0;i<height*2;i++){
			for(int j=0;j<width;j++){
				System.out.print(c[i/2][j]);
			}
			System.out.println();
		}

	}

}
