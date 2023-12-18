import java.awt.geom.Path2D;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			Path2D.Double data = new Path2D.Double();
			String[] str = sc.nextLine().split("[\\s]");
			double[] array = new double[8];
		
			for(int i = 0; i < 8; i++){
				array[i] = Double.parseDouble(str[i]);
			}
			data.moveTo(array[0], array[1]);
			data.lineTo(array[2], array[3]);
			data.lineTo(array[4], array[5]);
			
			boolean flag = false;
			
			if(data.contains(array[6], array[7])){
				flag = true;
			}
			print(flag);
		}
	}
	public static void print(boolean tmp) {
		if(tmp)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}
	}
}