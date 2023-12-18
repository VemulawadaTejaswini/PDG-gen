import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new A().doIt();
	}


	class A{
		void doIt(){
			while(true){
				int b[] = new int [1000];
				int min = Integer.MAX_VALUE, max = 0, sum = 0;
				int count = in.nextInt();
				if(count ==0)return;
				for(int i = 0; i < count; i++)b[i] = in.nextInt();
				for(int i=0;i<count;i++){
					sum += b[i];
					min = Math.min(min, b[i]);
					max = Math.max(max, b[i]);
				}
				sum -= min;
				sum -= max;
				double result = (1.0 * sum) / (count - 2);
				System.out.println((int)result);
			}
		}

	}
}