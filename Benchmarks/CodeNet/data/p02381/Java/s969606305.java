import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int n = s.nextInt();
			if(n == 0)	break;
			int[] stu = new int[n];
			int sum = 0;
			for(int i = 0;i < n;i++){
				stu[i] = s.nextInt();
				sum+=stu[i];
			}
			double m = ((double) sum) / n;
			double a = 0;
			for(int i = 0;i < n;i++){
				a += (stu[i] - m) * (stu[i] - m);
			}
			a /= n;
			a = Math.sqrt(a);
			System.out.println(a);
		}
	}
	public static void main(String args[]){
		new Main().run();
	}
}