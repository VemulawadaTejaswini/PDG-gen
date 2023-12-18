import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int height, width;
		int h, w;

		height = sc.nextInt();
		width = sc.nextInt();

		while(height != 0 || width != 0){
			h = 0;
			while(true){
				if(h < height){
					w = 0;
					while(true){
						if(w < width){
							System.out.print("#");
							w++;
						}else{
							break;
						}
						if(w < width){
							System.out.print(".");
							w++;
						}else{
							break;
						}
					}
					System.out.println();
					h++;
					w = 0;
					if(h < height){
						while(true){
							if(w < width){
								System.out.print(".");
								w++;
							}else{
								break;
							}
							if(w < width){
								System.out.print("#");
								w++;
							}else{
								break;
							}
						}
						System.out.println();
						h++;
					}
				}else{
					break;
				}
			}

			height = sc.nextInt();
			width = sc.nextInt();
		}

	}
}
