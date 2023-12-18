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
		int notfound =0;
		for(int i=0; i<lineTamount; i++){
			lineTnum[i] = scan.nextInt();
		}

		for(int i=0; i<lineSamount; i++){
			int j = 0;
			lineTnum[lineTamount] = lineSnum[i];
			while(lineTnum[j] != lineSnum[i]){
				j++;
			}
			if(j == lineTnum.length-1 ){
//				????????????????????£??????
				notfound++;
			}
			else {
				finded++;
				lineTnum[j] = -1;
			}
		}
		System.out.println(finded);
	}
}