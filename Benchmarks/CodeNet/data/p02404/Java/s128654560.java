import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h,w,i,b;

		for(i=0;i<=1;){
			h = sc.nextInt(); w = sc.nextInt();
			if(h<=0){
				if(w<=0){
					i =2;
				}
			}
				for(b=0;b<w;b++){
					System.out.print("#");
				}System.out.println("");
				for(b=0;b<w;b++){
					System.out.print("#");
					for(b=2;b<w;b++){
						System.out.print(".");
					}
					System.out.print("#");
				}System.out.println("");
				for(b=0;b<w;b++){
					System.out.print("#");
				}
				if(i!=0){
					break;
				}
				System.out.println("");
				System.out.println("");
			}
			System.out.println("");
			sc.close();
		}
	}
