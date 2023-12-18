import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true) {
		int h = sc.nextInt();
		int w = sc.nextInt();
		if(h == 0 || w == 0) break;
		
		for(int i = 0; i < h; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < w; j++) {
					if (j % 2 == 0)
						System.out.print("#");
					else
						System.out.print(".");
				}
				System.out.println();	
			}else{
				for(int j = 0; j < w; j++) {
					if (j % 2 == 0)
						System.out.print(".");
					else
						System.out.print("#");
				}
				System.out.println();
			}
		}
		System.out.println();
		sc.nextLine();
		}
		sc.close();
	}
}

/**

System.out.print("#");
System.out.println();
for(int l = 1; l < h-1; l++) {
System.out.print("#");
for(int j = 1; j < w-1; j++)
	System.out.print(".");
System.out.print("#\n");
}
for(int j = 0; j < w; j++)
System.out.print("#");
*/
