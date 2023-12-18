import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int ary[][] = new int[num][6];
		
		for(int i=0; i<num; i++){
			for(int j=0; j<6; j++){
				ary[i][j] = sc.nextInt();
			}
		}
		int ary2[] = new int[6];
		int ary3[] = new int[6];
		int co = 0;
	it:	for(int i=0; i<num-1; i++){
			for(int j=i+1; j<num; j++){
				for(int k=0; k<6; k++){
					ary2[k]=ary[i][k];
					ary3[k]=ary[j][k];
				}
				co = plan(ary2,ary3);
				if(co==4)break it;
			}
		}
		if(co==4){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
		
		public static int plan(int[] d, int[] t){
		int sd1ary[] = {d[0], d[5], d[1], d[2], d[4], d[3]};
		int sd2ary[] = {t[0], t[1], t[2], t[3], t[4], t[5]};
		int sd3ary[][] = 
			   {{t[0], t[5], t[1], t[2], t[4], t[3]}, 
				{t[1], t[4], t[0], t[3], t[5], t[2]}, 
				{t[2], t[3], t[4], t[0], t[1], t[5]},  
				{t[3], t[2], t[4], t[5], t[1], t[0]},  
				{t[4], t[1], t[2], t[5], t[3], t[0]},  
				{t[5], t[0], t[3], t[4], t[2], t[1]}};
		int count = 0;
		int add = 0;
		
  out : for(int k=0; k<6; k++){
			if(sd1ary[0] == sd2ary[k]){
				if(sd1ary[1]!=sd3ary[k][1])break;
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
		return count;
	}
}