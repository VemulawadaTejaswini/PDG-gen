import java.util.*;
public class Main {
    public static boolean[][] map;
    public static int[][] done;
  	public static int H;
  	public static int W;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     	H = sc.nextInt();
      	W = sc.nextInt();
      	map = new boolean[H+1][W+1];
  		done = new int[H+1][W+1];
      	int Ch = sc.nextInt();
      	int Cw = sc.nextInt();
      	int Dh = sc.nextInt();
      	int Dw = sc.nextInt();
      	for(int i=0;i<H;i++){
          String s = sc.next();
          for(int j=0;j<W;j++){
            if( s.charAt(j) == '.' ){
              map[i][j] = true;
            }else{
              map[i][j] = false;
            }
          }
        }
      	for(int i=0;i<H+1;i++){
          for(int j=0;j<W+1;j++){
            done[i][j] = 999999;
          }
        }
      	hukasa(Ch,Cw,0);
      	for(int i=1;i<H+1;i++){
          for(int j=1;j<W+1;j++){
            //System.out.print(done[i][j]+",");
            //System.out.println(done[Dh][Dw]);
          }
          //System.out.println();
        }
      	if(done[Dh][Dw] == 999999 ){
          done[Dh][Dw] = -1;
        }
      System.out.println(done[Dh][Dw]);
	}
  public static void hukasa(int x,int y,int count){
    if( ( count < done[x][y]) && ( map[x][y] ) ){
      //System.out.println(x+":"+y+":"+count);
      done[x][y] = count;
      warp(x,y,count);   
    }
  }
  public static void warp(int x,int y,int count){
    int xpos = x-2;
    int ypos = y-2;
    //System.out.println(x+":"+ypos+":"+count);
    for(int t=0;t<4;t++){
      if( t==0 ){
        xpos--;
      }else if(t==1){
        xpos++;
        xpos++;
      }else if(t==2){
        xpos--;
        ypos++;
      }else if(t==3){
        ypos--;
        ypos--;
      }
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){  
          if( ((xpos+i)>=1)&&( (ypos+j) >=1)&&((xpos+i)<=H)&&((ypos+j)<=W)){
            //System.out.println((xpos+i)+":"+(ypos+j)+":"+map[(xpos+i)][(ypos+j)]);
            hukasa((xpos+i),(ypos+j),(count+1));
          }
        }
        }
      }
    }
  }