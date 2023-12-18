import java.util.*;
import java.util.Map.Entry;

 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int anser=0;
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] s = new int[H][W];
        int[][] ans = new int[H][W];
		for(int i=0;i<H;i++) {
			String ss = sc.next();
			for(int j=0;j<W;j++) {
//				System.out.println(ss.substring(j,j+1));
				if ("#".equals(ss.substring(j,j+1))) {
					s[i][j]=0;
				} else {
					s[i][j]=1;
				}
			}
        }
        
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(s[i][j]==1) {
					int count=0;
					for(int k=j+1;k<W&&s[i][k]==1;k++) {
						count++;
					}
					for(int k=0;k<=count;k++) {
						ans[i][j]=count;
						j++;
					}
				}
			}
		}
		for(int j=0;j<W;j++) {
			for(int i=0;i<H;i++) {
				if(s[i][j]==1) {
					int count=0;
					for(int k=i+1;k<H&&s[k][j]==1;k++) {
						count++;
					}
					for(int k=0;k<=count;k++) {
						ans[i][j]=ans[i][j]+count;
						if(anser<ans[i][j]) {
							anser=ans[i][j];
						}
						i++;
					}
				}
			}
		}
		
		
        System.out.println(anser+1);			
    }
}