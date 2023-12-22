import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    int[][] c = new int[h][w];
    for(int i = 0;i<h;i++){
      String s = sc.next();
      for(int j = 0;j<w;j++){
        if(s.substring(j,j+1).equals("#")){
          c[i][j] = 1;
        }
      }
    }
    int count = 0;
    for(int i = 0;i<(1<<h);i++){
      List<Integer> lih = new ArrayList<Integer>();
      for(int bith = 0;bith<h;bith++){
        int bibih = i & (1<<bith);
        if(bibih == 0){
          lih.add(bith);
        }
      }

      for(int j = 0;j<(1<<w);j++){
        List<Integer> liw = new ArrayList<Integer>();
        for(int bitw = 0;bitw<w;bitw++){
          int bibiw = j & (1<<bitw);
          if(bibiw == 0){
            liw.add(bitw);
          }
        }
        int kuro = 0;
        for(int ki = 0;ki<lih.size();ki++){
          for(int kk = 0;kk<liw.size();kk++){
            if(c[lih.get(ki)][liw.get(kk)] == 1)kuro++;
          }
        }
        if(kuro == k)count++;
      }
    }
    System.out.println(count);
  }
}
