import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int x,y,i,j;
		
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0){
				sc.close();
				return;
			}
			else{
				for(i=0;i<x;i++){
					for(j=0;j<y;j++){
						System.out.print('#');
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}

}
