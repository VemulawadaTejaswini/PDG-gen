import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(scan.hasNext()){
				double[] point = new double[4];
				for(int i = 0 ; i < 4;i++){
					point[i] = scan.nextDouble();
				}
				double d = 0;
				for(int i = 0; i < 2;i ++){
					d += Math.pow(point[i] - point[i+2], 2);
				}
				d = Math.sqrt(d);
				System.out.println(d);
			}
		}finally{
			scan.close();
		}
	}
}