import java.util.Scanner;
public class main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] pasta = new int[3];
		int [] drink = new int[2];
		int [][] price = new int[3][2];
		for(int i = 0;i < 3;i++){
			pasta[i] = sc.nextInt();
		}
		for(int j = 0;j < 2;j++){
			drink[j] = sc.nextInt();
		}
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 2;j++){
				price[i][j] = pasta[i] + drink[j]-50;
			}
		}
		int min = price[0][0];
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 2;j++){
				if(min > price[i][j]){
					min = price[i][j];
				}
			}
		}
		System.out.println(min);
	}

}