import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int finded = 0;
		int lineSamount = scan.nextInt();
		int[] lineSnum = new int[lineSamount];
		for(int i=0; i<lineSamount; i++){
			lineSnum[i] = scan.nextInt();
		}
		int lineTamount = scan.nextInt();
		int[] lineTnum = new int[lineTamount+1];
		for(int i=0; i<lineTamount; i++){
			lineTnum[i] = scan.nextInt();
		}

		for(int i=0; i<lineTamount; i++){
			int left = 0 ;
			int right = lineSamount;
			int mid = lineSamount / 2 ;
			
			while(left<right){
				int move = 0;
				int plusmove = 0;
				int minusmove = 1;
//				System.out.println(left+" L R "+right);/
				mid = (left+right)/2;
				if(lineTnum[i] == lineSnum[mid]){
//					System.out.println("found!");
					finded++;
					break;
				}
				else if(lineTnum[i] < lineSnum[mid]){
					right = mid;
				}
				else if(lineTnum[i] > lineSnum[mid]){
					left = mid+1;
				}
//				System.out.println("mid = "+mid);
			}
//			System.out.println("ende");
		}
		System.out.println(finded);
	}
}