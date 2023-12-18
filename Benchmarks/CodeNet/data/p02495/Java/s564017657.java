import java.util.Scanner;

public class Main {

	static char[] c=new char[]{'#','.'};

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String[] size=s.nextLine().split(" ");
			drawQuad(Integer.parseInt(size[0]), Integer.parseInt(size[1]));
		}
	}

	private static void drawQuad(int x,int y){
		for(int i=0;i<x;i++){
			StringBuilder b=new StringBuilder();
			for(int k=0;k<y;k++){
				b.append(c[(i+k)%2]);
			}
			System.out.println(b.toString());
		}
		System.out.println("");
	}
}