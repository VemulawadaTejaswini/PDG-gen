import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		int I[] = new int[n];
		double h[] = new double[n];
		double w[] = new double[n];
		double BMI[] = new double[n];
		while(n != 0){
			for(int i = 0 ; i < n ; i++){
				I[i] = scan.nextInt();
				h[i] = scan.nextInt();
				w[i] = scan.nextInt();
				BMI[i] = (w[i]/(((h[i]/100)*(h[i]/100))));
			}
			double ue = 0;
			int kazuUE = 0;
			double sita = 0;
			int kazuSITA = 0;
			double hantei1 = 100.0;
			double hantei2 = 0.0;
			for(int i  = 0 ; i < n ; i++){
				if(22 < BMI[i]){
					if(hantei1 > BMI[i]){
						hantei1 = BMI[i];
						ue = BMI[i];
						kazuUE = i;
					}else if(hantei1 == BMI[i]){
						if(I[i] < I[kazuUE]){
							kazuUE = i;
						}
					}
				}else{
					if(hantei2 < BMI[i]){
						hantei2 = BMI[i];
						sita = BMI[i];
						kazuSITA = i;
					}else if(hantei2 == BMI[i]){
						if(I[i] < I[kazuSITA]){
							kazuSITA = i;
						}
					}
				}
			}
			if(ue == 0){
				System.out.println(I[kazuSITA]);
			}else if(sita == 0){
				System.out.println(I[kazuUE]);
			}else if((ue-22.0) > (22.0-sita)){
				System.out.println(I[kazuSITA]);
			}else if(((ue-22.0) < (22.0-sita))){
				System.out.println(I[kazuUE]);
			}else{
				if(I[kazuUE] < I[kazuSITA]){
					System.out.println(I[kazuUE]);
				}else{
					System.out.println(I[kazuSITA]);
				}
			}
			n = scan.nextInt();
		}
	}
}