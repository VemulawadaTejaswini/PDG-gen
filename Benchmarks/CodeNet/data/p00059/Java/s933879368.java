import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double [] ax = new double[2];
			double [] ay = new double[2];
			double [] bx = new double[2];
			double [] by = new double[2];
			for(int i=0; i < 2; i++){
				ax[i] = sc.nextDouble();
				ay[i] = sc.nextDouble();
			}
			for(int i=0; i < 2; i++){
				bx[i] = sc.nextDouble();
				by[i] = sc.nextDouble();
			}
			boolean flg = true;

			if(bx[1] < ax[0] || ax[1] < bx[0])
				flg = false;
			if(ay[1] < by[0] || by[1] < ay[0])
				flg = false;

			if(flg)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}