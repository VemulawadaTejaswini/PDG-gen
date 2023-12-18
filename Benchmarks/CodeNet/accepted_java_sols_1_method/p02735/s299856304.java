import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
        String [] str = new String [H];
        int [][] ans = new int [H][W];
        int ans1,ans2;
        for(int i=0;i<H;i++){str[i] = sc.next();                             
                            }
		if(str[0].charAt(0)=='#'){ans[0][0]=1;}
        for(int i=1;i<W;i++){if(str[0].substring(i-1,i+1).equals(".#"))
                            {ans[0][i]=ans[0][i-1]+1;}
                             else{ans[0][i]=ans[0][i-1];}
                            }
        for(int i=1;i<H;i++){if(str[i-1].charAt(0)=='.'&&str[i].charAt(0)=='#')
                            {ans[i][0]=ans[i-1][0]+1;}
                             else{ans[i][0]=ans[i-1][0];}
                            }
        for(int i=1;i<H;i++){for(int j=1;j<W;j++){
                             if(str[i].substring(j-1,j+1).equals(".#"))
                            {ans1=ans[i][j-1]+1;}
                             else{ans1=ans[i][j-1];}
                            if(str[i-1].charAt(j)=='.'&&str[i].charAt(j)=='#')
                            {ans2=ans[i-1][j]+1;}
                             else{ans2=ans[i-1][j];}
                             ans[i][j]=Math.min(ans1,ans2);
                            }
                            }        
		System.out.println(ans[H-1][W-1]);
	}
}