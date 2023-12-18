import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] data={{sc.nextInt(),sc.nextInt(),sc.nextInt()},
					  {sc.nextInt(),sc.nextInt()}
					 };
		int tmp=0;
		int sum=0;
		for(int i=0;i<data.length;i++){
			tmp=data[i][0];
			for(int j=1;j<data[i].length;j++){ 
				if(tmp>data[i][j]){
					tmp=data[i][j];
				}
			}
			sum+=tmp;
		}
		System.out.println(sum-50);
	}
}