import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			double v = cin.nextDouble();
			int i=1;
			while(true){
				double t = Math.sqrt((5*i-5)/4.9);
				if(9.8*t >= v){
					System.out.println(i);
					break;
				}
				i++;
			}
		}
	}

}