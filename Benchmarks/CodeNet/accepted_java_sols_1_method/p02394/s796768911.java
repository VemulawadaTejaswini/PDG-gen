import java.util.Scanner;

public class Main {

	
	static Scanner scan = new Scanner(System.in);
		public static void main(String[] args){
			//判定
			boolean flag = true;

			//長方形
			int rec_x = scan.nextInt();
			int rec_y = scan.nextInt();
//			int rec_x = Integer.parseInt(args[0]);
//			int rec_y = Integer.parseInt(args[1]);

			//円
			int cir_x = scan.nextInt();
			int cir_y = scan.nextInt();
			int r = scan.nextInt();
//			int cir_x = Integer.parseInt(args[2]);
//			int cir_y = Integer.parseInt(args[3]);
//			int r = Integer.parseInt(args[4]);

			int r_y_min = cir_y -r;
			int r_y_max = cir_y + r;
			int r_x_min = cir_x -r;
			int r_x_max = cir_x +r;

			if(r_x_max > rec_x){
				flag = false;
			}
			if(r_x_min < 0){
				flag = false;
			}
			if(r_y_min < 0){
				flag = false;
			}
			if(r_y_max > rec_y){
				flag = false;
			}
			if(flag){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		}
}
