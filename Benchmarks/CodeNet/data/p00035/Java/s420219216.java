import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] str = (scan.nextLine()).split(",");
			double[] point = new double[str.length];
			for(int i = 0;i < str.length;i++){
				point[i] = Double.parseDouble(str[i]);
			}
			double a1 = 0;
			double a2 = 0;
			double b1 = 0;
			double b2 = 0;
			double x1 = 0;
			double x2 = 0;
			if(point[0] == point[4]){
				x1 = point[0];
			}else{
				a1 = (point[1]-point[5])/(point[0]-point[4]);
				b1 = (point[0]*point[5]-point[4]*point[1])/(point[0]-point[4]);
				x1 = (point[7]-b1)/a1;
			}
			if(point[2] == point[4]){
				x2 = point[1];
			}else{
				a2 = (point[3]-point[5])/(point[2]-point[4]);
				b2 = (point[2]*point[5]-point[4]*point[3])/(point[2]-point[4]);
				x2 = (point[7]-b2)/a2;
			}
			if(x1 < x2){
				if(x1 < point[6] && x2 > point[6]){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}else{
				if(x2 < point[6] && x1 > point[6]){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}
		}
	}
}