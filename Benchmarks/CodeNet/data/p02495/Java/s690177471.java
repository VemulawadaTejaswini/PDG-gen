import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int h,w;
		int i,j;

		while(true){
			h = sc.nextInt();
			w = sc.nextInt();

			if(h == 0 && w ==0)break;

			for(i = 0;i < h;){
				for(j = 0;j < w;){
					System.out.printf("#");
					j++;
					if(j >= w)break;
					System.out.printf(".");
					j++;
				}
				System.out.println("");
				i++;
				if(i >= h)break;
				for(j = 0;j < w;){
					System.out.printf(".");
					j++;
					if(j >= w)break;
					System.out.printf("#");
					j++;
				}
				System.out.println("");
				i++;
				if(i >= h)break;
			}
		}
	}
}