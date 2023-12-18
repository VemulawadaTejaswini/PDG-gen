//Volume5-0532
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int start,end,time;

		for(int i=0;i<3;i++){
			start = (sc.nextInt() * 60 + sc.nextInt()) * 60 + sc.nextInt();
			end   = (sc.nextInt() * 60 + sc.nextInt()) * 60 + sc.nextInt();
			time  = end - start;
			System.out.println((time/3600)+" "+(time%3600/60)+" "+(time%60));
		}
	}
}