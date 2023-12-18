import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int ver=scan.nextInt();
    int side=scan.nextInt();
    int rednum=scan.nextInt();
    int ans=0;
    int bronum=0;
    String[][] squ=new String[ver][side];
    int blackver[]=new int[ver];
    int blackside[]=new int [side];
    String test;
    for(int a=0; a<squ.length; a++){
      test=scan.next();
      squ[a]=test.split("");
      /*for(int b=0; b<squ[a].length; b++){
        if(squ[a][b].equals("#")){
          blackver[a]++;
          blackside[b]++;
        }
      }*/
    }
    //int bitvermax=1<<ver;
    //int bitsidemax=1<<side;
    int bit=0;
    for(int a=0; a<1<<ver; a++){
      for(int b=0; b<1<<side; b++){
        bit=0;//1=no, 0=red
        for(int c=0; c<ver; c++){
          for(int d=0; d<side; d++){
            if(((a>>c & 1)==1) && ((b>>d & 1)==1)){
              //System.out.println(a+" "+b+" "+squ[c][d]);
              if(squ[c][d].equals("#")){
                bit++;
              }
            }
          }
        }
        //System.out.println(a+" "+b+" "+bit);
        if(bit==rednum){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}