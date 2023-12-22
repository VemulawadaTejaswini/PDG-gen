import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int k = scanner.nextInt();
    scanner.nextLine();
    int[][] c = new int[h][w];
    for(int i=0; i<h; i++){
      String str = scanner.nextLine();
      for(int j=0; j<w; j++){
        if(str.charAt(j)=='#'){
          c[i][j] = 1;
        }
      }
    }
  

    int ans = 0;
    for (int i=0; i<Math.pow(2,h); i++){
      for (int j=0; j<Math.pow(2,w); j++){
        String i_bin = String.format("%"+h+"s",Integer.toBinaryString(i)).replace(" ", "0");
        String j_bin = String.format("%"+w+"s",Integer.toBinaryString(j)).replace(" ", "0");
        // System.out.println(i_bin + ","+j_bin);
        int[][] tmp = new int[c.length][c[0].length];
        for (int l=0; l < c.length; l++) {
          tmp[l] = new int[c[l].length];
          System.arraycopy(c[l], 0, tmp[l], 0, c[l].length);
      }
        // System.out.println(Arrays.deepToString(tmp));

        for(int l=0; l<i_bin.length(); l++){
          if(i_bin.charAt(l) == '1'){
            for(int m=0; m<w; m++){
              tmp[l][m] = 0;
            }
          }
        }
        for(int l=0; l<j_bin.length(); l++){
          if(j_bin.charAt(l) == '1'){
            for(int m=0; m<h; m++){
              tmp[m][l] = 0;
            }
          }
        }
        // System.out.println(Arrays.deepToString(tmp));
        int sum = 0;
        for(int l=0; l<h;l++){
          sum += Arrays.stream(tmp[l]).sum();
        }
        if(sum == k){
          ans ++;
        }

      }

    }


    System.out.println(ans);
    
    scanner.close();
    return;
  }
  
}
