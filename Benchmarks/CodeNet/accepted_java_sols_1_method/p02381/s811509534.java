import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			int n = Integer.parseInt(std.next());
			if(n==0){break;}

			double score[] = new double[n];
			double ave = 0;
			for(int i=0; i<n; i++){
				score[i] = Double.parseDouble(std.next());
				ave += score[i];
			}
			ave /= n;
			double sd = 0;
			for(int i=0; i<n; i++){
				sd += Math.pow((score[i]-ave),2);
			}
			sd /= n;
			sd = Math.pow(sd, 0.5);

			System.out.println(String.format("%.5f", sd));
		}
	}
}