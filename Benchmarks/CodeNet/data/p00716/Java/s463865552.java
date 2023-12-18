import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		for(int i = 0; i < m; i++){
			int syoki = in.nextInt();
			int nensu = in.nextInt();
			int n = in.nextInt();
			int max = 0;
			for(int j = 0; j < n; j++){
				int isHukuri = in.nextInt();
				double nenriRate = in.nextDouble();
				int tesuryo = in.nextInt();

				int a = syoki;
				int totalB = 0;
				for(int k = 0; k < nensu; k++){
					if(isHukuri == 1){
						a += (int)(a * nenriRate);
						a -= tesuryo;
					}else{
						totalB += (int)(a*nenriRate);
						a -= tesuryo;
					}
				}
				int total = a + totalB;
				if(max < total) max =total;
			}
			System.out.println(max);
		}
		in.close();
	}

}