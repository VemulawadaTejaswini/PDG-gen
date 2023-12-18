import java.util.*;
//import java.text.*;

class Main{

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int n;
	String st,ba,sto;
	int[] dx = {0,1,0,-1};
	int[] dy = {1,0,-1,0};
	int[][] map = {{0,0,0},
                       {0,0,0},
                       {0,0,0}};

	while(true){
	    n = in.nextInt();
	    Double[][][] dp = new Double[15][4][4];
	    for(int i=0;i<15;i++)for(int j=0;j<4;j++)for(int k=0;k<4;k++)dp[i][j][k]=0.0;
	    if(n == 0)break;
	    st = in.next();
	    ba = in.next();
	    sto = in.next();
	    map[y11(st)][x11(st)]=1;//X^[g
	    map[y11(ba)][x11(ba)]=9;//[d
	    map[y11(sto)][x11(sto)]=8;//qÉ

	    int nx,ny;
	 	   
	    dp[n][y11(st)][x11(st)]=1.0;

	    while(true){
		if(n == 0)break;

		
		for(int t=0;t<2;t++){
		    for(int g =0 ;g<2;g++){
			for(int i=0;i<4;i++){
			    nx = g+dx[i];
			    ny = t+dy[i];		    
			    if(nx>2 || ny>2 ||nx<0 || ny<0)continue;
			    if(nx == x11(sto) && ny == y11(sto)){nx = g;
				ny = t;
			    }
			    dp[n-1][ny][nx] += dp[n][t][g]/4.0;		    
			}
		    }
		}
		n--;

	    }
 
	    // ----------------DEBUG--------------//
	    /*   
		for(int g=0;g<3;g++){
		    for(int f=0;f<3;f++){
			System.out.print(dp[0][g][f] + " ");
		    }
	System.out.printf("\n");
		}
	
		*/
	    //----------------DEBUG---------------//
	    //   DecimalFormat dc = new DecimalFormat();
	 
	    System.out.println(dp[0][y11(ba)][x11(ba)]);


	}




    }

    public static int y11(String s){
	if(s.equals("A"))return 0;
	if(s.equals("B"))return 0;
	if(s.equals("C"))return 0;
	if(s.equals("D"))return 1;
	if(s.equals("E"))return 1;
	if(s.equals("F"))return 1;
	if(s.equals("G"))return 2;
	if(s.equals("H"))return 2;
	if(s.equals("I"))return 2;

	return 9; //±êªÈ¢Æ½©returnµëIÆ¢¤G[ªÅÄ­éÌÅKÉ9ðÔ·æ¤ÉµÆ¢½@x11Ìreturn 9;à¯¶R
    }
    public static int x11(String s){
	if(s.equals("A"))return 0;
	if(s.equals("B"))return 1;
	if(s.equals("C"))return 2;
	if(s.equals("D"))return 0;
	if(s.equals("E"))return 1;
	if(s.equals("F"))return 2;
	if(s.equals("G"))return 0;
	if(s.equals("H"))return 1;
	if(s.equals("I"))return 2;

	return 9;
    }



}



/*@Yê½Ì´êpðà

Q:3d[vÌÆ±ÈÉµÄñÌH
A:®SÌðÝÄ(n-i)ñ(i=0,1,EEE,n Å n=0Ìnñ®¢½Ê n=nÌ1ñ®¢½Ê)ÌÊð¾µÄé
µ¢m¦Å®­©ç1ñ®¢½ç4ÅêÎ¢¢

àµ±êæñÅàí©çÈ¢pÈçvOÌDEBUGð\¦³¹Ä®«ðmFµÄÝéÆ¢¢
n=0ÆÈÁÄ¢é©çwè³ê½ñ®¢½Êð\¦·éæ¤ÉÈÁÄ¢é

*/