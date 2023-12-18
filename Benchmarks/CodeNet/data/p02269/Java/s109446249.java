import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileStore;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String[] order;
      StringBuilder result = new StringBuilder(n*4);
      Dictionary dict = new Dictionary(4*5*5, n/4);

      for(int i=0; i<n; i++) {
        order = br.readLine().split(" ");
        switch( order[0] ) {
          case "insert" :
            dict.insert(order[1]);
            break;
          case "find" :
            result.append( dict.find(order[1]) ).append("\n");
            break;
        }
      }

      System.out.print(result);
    }
  }
}

class Dictionary {
  String[][] dict2d;
  int[] pos;
  int[][][] dictIndex;

  public Dictionary(int first, int second) {
    dict2d = new String[first][second];
    pos = new int[first];
    dictIndex = new int[4][5][5];
    for(int i=0,j,k,n=0; i<4; i++) {
      for(j=0; j<5; j++) {
        for(k=0; k<5; k++) {
          dictIndex[i][j][k] = n++;
        }
      }
    }
  }

  public void insert(String str) {
    int index = getIndex(str);
    dict2d[index][pos[index]++] = str;
  }
  public String find(String ref) {
    int index = getIndex(ref);
    boolean result = isExistSeachBylinear(index, ref);

    return result ? "yes" : "no";
  }
  private int Str1ToInt(String s1) {

    switch( s1 ) {
      case "A" :
        return 0;
      case "C" :
        return 1;
      case "G" :
        return 2;
      case "T" :
        return 3;
      default :
        return -1;
    }

  }
  private int getIndex(String str) {
    int d1,d2,d3;
    switch(str.length()) {
      case 1 :
        d1 = Str1ToInt(str.substring(0, 1));
        return dictIndex[d1][4][4];
      case 2 :
        d1 = Str1ToInt(str.substring(0, 1));
        d2 = Str1ToInt(str.substring(1, 2));
      return dictIndex[d1][d2][4];
      default :
        d1 = Str1ToInt(str.substring(0, 1));
        d2 = Str1ToInt(str.substring(1, 2));
        d3 = Str1ToInt(str.substring(2, 3));
        return dictIndex[d1][d2][d3];
    }
  }
  private boolean isExistSeachBylinear(int index, String ref) {

    for (int i=0; i<pos[index]; i++) {
      if(ref.length() == dict2d[index][i].length())
        if(ref.equals(dict2d[index][i])) return true;
    }

    return false;
  }
}
