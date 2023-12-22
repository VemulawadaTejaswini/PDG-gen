import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=0 ; i<num ; i++){
			double [] a = new double[6];
			for(int j=0 ; j<6 ; j++)
				a[j] = s.nextDouble();
			double d = Math.sqrt((a[3]-a[0])*(a[3]-a[0])+(a[4]-a[1])*(a[4]-a[1]));
			if(d<=a[2]+a[5]&&Math.abs(a[2]-a[5])<=d){
				System.out.println(1);
				continue;
			}
			if(d<Math.abs(a[2]-a[5])){
				if(a[2]>a[5])
					System.out.println(2);
				else
					System.out.println(-2);
				continue;
			}
			System.out.println(0);
		}
    }
}