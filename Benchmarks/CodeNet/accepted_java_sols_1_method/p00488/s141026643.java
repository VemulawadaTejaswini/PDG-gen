import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum,i;
		int pasta[] = new int[3];
		int juice[] = new int[2];
		for(i=0;i<3;i++){
			pasta[i]=sc.nextInt();
		}
		for(i=0;i<2;i++){
			juice[i]=sc.nextInt();
		}
		sum=pasta[0]+juice[0]-50;
		for(i=0;i<3;i++){
			for(int j=0;j<2;j++){
				if(sum>pasta[i]+juice[j]-50){
					sum=pasta[i]+juice[j]-50;
				}
			}
		}
		System.out.println(sum);
	}

}