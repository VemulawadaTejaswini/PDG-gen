import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    char[][] figure = new char[H][W];
    List<Integer> Hlist = new ArrayList<Integer>();
    List<Integer> Wlist = new ArrayList<Integer>();
    for(int i=0;i<H;i++){
      String s = sc.next();
      if(s.contains("#")){
        Hlist.add(i);
      }
      for(int j=0;j<W;j++){
        figure[i][j]=s.charAt(j);
      }
    }


    for(int i=0;i<W;i++){
      boolean contain_s = false;
      for(int j=0;j<H;j++){
        if(figure[j][i]=='#'){
          contain_s =true;
          break;
        }
      }
      if(contain_s){
        Wlist.add(i);
      }
    }

    for(int h : Hlist){
      for(int w : Wlist){
        System.out.print(figure[h][w]);
      }
      System.out.println("");
    }
  }
}
