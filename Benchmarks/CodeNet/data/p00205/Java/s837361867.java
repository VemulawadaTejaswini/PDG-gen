import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		Main myclass = new Main();
		int n[] =new int[5];
		n[0] = scan.nextInt();
		while(n[0] != 0){
			int cun1 = 0;
			int cun2 = 0;
			int cun3 = 0;
			if(n[0] == 1){
				++cun1;
			}else if(n[0] == 2){
				++cun2;
			}else if(n[0] == 3){
				++cun3;
			}
			for(int i = 1 ; i < 5 ; i++){
				n[i] = scan.nextInt();
				if(n[i] == 1){
					++cun1;
				}else if(n[i] == 2){
					++cun2;
				}else if(n[i] == 3){
					++cun3;
				}
			}
			if(cun1 != 0 && cun2 != 0 && cun3 != 0){
				for(int i = 0 ; i < 5 ; i++){
					System.out.println(3);
				}
			}else{
				for(int i = 0 ; i < 4 ; i++){
					int syouhai[] = new int[5];
					myclass.hantei(syouhai , n , 0 , 1);
					for(int j = 0 ; j < 5 ; j++){
						System.out.println(syouhai[j]);
					}
				}
			}
			n[0] = scan.nextInt();
		}
	}
	public int[] hantei(int[] syouhai , int[] n , int naw , int next){
		if(next < 5){
			if(n[naw] == 1 && n[next] == 2 || n[naw] == 2 && n[next] == 3 || n[naw] == 3 && n[next] == 1){
				syouhai[naw] = 1;
				syouhai[next] = 2;
				this.hantei(syouhai, n, naw, next+1);
			}else if(n[naw] == n[next]){
				syouhai[naw] = 1;
				syouhai[next] = 1;
				this.hantei(syouhai, n, naw, next+1);
			}else{
				syouhai[naw] = 2;
				syouhai[next] = 1;
				this.hantei(syouhai, n, next, next+1);
			}
		}
		return syouhai;
	}
}