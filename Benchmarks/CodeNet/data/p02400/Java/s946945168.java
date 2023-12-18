import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan =new Scanner(System.in);
			int r = scan.nextInt();
			System.out.printf("%f %f\n",Math.pow(r,2)*Math.PI,2 * r * Math.PI);
			}finally{
			if(scan !=null)scan.close();
		}

	}
}