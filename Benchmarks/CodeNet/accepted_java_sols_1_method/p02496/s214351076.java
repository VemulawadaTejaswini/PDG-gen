import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean matrix[][] = new boolean[4][13];
		for(int x=0; x<4; x++){
			for(int y=0; y<13; y++){
				matrix[x][y] = true;
			}
		}
		
		for(int k=0; k<n; k++){
			String m = in.next();
			int a = in.nextInt();
			if(m.equals("S")) matrix[0][a-1] = false;
			if(m.equals("H")) matrix[1][a-1] = false;
			if(m.equals("C")) matrix[2][a-1] = false;
			if(m.equals("D")) matrix[3][a-1] = false;
		}
		
		for(int x=0; x<4; x++){
			for(int y=0; y<13; y++){
				if(matrix[x][y]){
					switch(x){
					case 0:
						System.out.println("S "+(y+1));
						break;
					case 1:
						System.out.println("H "+(y+1));
						break;
					case 2:
						System.out.println("C "+(y+1));
						break;
					case 3:
						System.out.println("D "+(y+1));
						break;
					}
				}
			}
		}
	}
}