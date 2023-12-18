import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d[] = new int[12];
		for(int i=0; i<12; i++){
			d[i] = sc.nextInt();
		}
		int sd1ary[] = {d[0], d[5], d[1], d[2], d[4], d[3]};
		int sd2ary[] = {d[6], d[7], d[8], d[9], d[10], d[11]};
		int sd3ary[][] = 
			   {{d[6], d[11], d[7], d[8], d[10], d[9]}, 
				{d[7], d[10], d[6], d[9], d[11], d[8]}, 
				{d[8], d[9], d[10], d[6], d[7], d[11]},  
				{d[9], d[8], d[10], d[11], d[7], d[6]},  
				{d[10], d[7], d[8], d[11], d[9], d[6]},  
				{d[11], d[6], d[9], d[10], d[8], d[7]}};
		int count = 0;
		int add = 0;
		
  out : for(int k=0; k<6; k++){
			if(sd1ary[0] == sd2ary[k]){
				for(int j=2; j<6; j++){
					count=0;
					if(sd1ary[2]==sd3ary[k][j]){
						for(int n=0; n<4; n++){
							add = j+n;
							if(add>5) add=add-4;

							if(sd1ary[n+2]==sd3ary[k][add]){
								count++;
								if(count==4)break out;
							}
						}
					}
				}
			}
		}
		if(count==4){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}