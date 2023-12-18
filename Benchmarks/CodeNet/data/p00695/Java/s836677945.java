import java.util.Scanner;

public class Main {

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int  [][] data = new int[7][7];
			for(int i=1; i <= 5;i++){
				for(int j=1; j <= 5; j++){
					data[i][j] = sc.nextInt();
				}
			}

			int max = 0;
			for(int i=1; i <= 5; i++){
				for(int j=1; j <= 5; j++){
					if(data[i][j] == 0){
						continue;
					}
					int ijmax = 0;
					int pre = 0;
					int preCount = 1;
					for(int k = 0;i+ k <= 5; k++){
						int count = 0;
						for(int l = 0;j + l <= 5; l++){
							if(data[i+k][j+l] == 0){
								break;
							}
							else{
								count++;
							}
						}
						if(pre == count){
							count *= ++preCount;
						}
						else{
							pre = count;
							preCount = 1;
						}
						ijmax = Math.max(ijmax, count);
					}
					pre = 0;
					preCount = 1;
					for(int l = 0; j + l <= 5; l++){
						int count = 0;
						for(int k = 0; i +  k <= 5; k++){
							if(data[i+k][j+l] == 0){
								break;
							}
							else{
								count++;
							}
						}
						if(pre == count){
							count *= ++preCount;
						}
						else{
							pre = count;
							preCount = 1;
						}

						ijmax = Math.max(ijmax, count);
					}
					max = Math.max(max, ijmax);
				}
			}
			System.out.println(max);
//
//			for(int i=0; i <= 6;i++){
//				for(int j=0; j <= 6; j++){
//					System.out.print(data[i][j]+ " ");
//				}
//				System.out.println();
//			}
//			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}