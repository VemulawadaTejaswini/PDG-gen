import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int[] x = new int[3];
     x[0] = scan.nextInt();
     x[1] = scan.nextInt();
     x[2] = scan.nextInt();
     int y;
     for(int i=0 ; i<2 ; i++){
		if(x[0] > x[1]) {
			y = x[0];
			x[0] = x[1];
			x[1] = y;
		}
		if(x[1] > x[2]) {
			y = x[1];
			x[1] = x[2];
			x[2] = y;
		}
	}
     System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}
