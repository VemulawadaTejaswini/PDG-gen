import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] map = new int[n][n];
			
			String s = "";
			int sum = 0;
			for(int i=0;i<n;i++){
				s = sc.next();
				for(int j=0;j<n;j++){
					if(s.codePointAt(j)==42){
						map[i][j] = 1;
						sum++;
					}
				}
			}		
			
			if(sum == n*n){
				System.out.println("0");
			}else{
			
				int len = 0;
				boolean out = true;
				for(int i=0;i<n;i++){
					len = n-i;
					for(int j=0;j<=i;j++){
						for(int k=0;k<=i;k++){
							out = true;
							for(int a=0;a<len;a++){
								for(int b=0;b<len;b++){
									if(map[j+a][k+b]==1){
										out = false;
										a=len;
										b=len;
									}
								}
							}
							if(out==true){
								System.out.println(len);
								j = n+1;
								k = n+1;
								i = n;
							}
						}
					}
				}
			}
			
		}
	
	}	
}