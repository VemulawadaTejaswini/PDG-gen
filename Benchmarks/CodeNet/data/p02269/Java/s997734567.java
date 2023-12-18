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
      Dictionary dict = new Dictionary(4,5,5,5,5, 100+(n/100));

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
  int[][][][][] dictIndex;

  public Dictionary(int d1,int d2, int d3,int d4,int d5, int str) {
    dict2d = new String[d1*d2*d3*d4*d5][str];
    pos = new int[d1*d2*d3*d4*d5];
    dictIndex = new int[d1][d2][d3][d4][d5];
    for(int i=0,j,k,l,m,o=0; i<d1; i++)
      for(j=0; j<d2; j++)
        for(k=0; k<d3; k++)
          for(l=0; l<d4; l++)
            for(m=0; m<d5; m++) {
              pos[o] = 0;
              dictIndex[i][j][k][l][m] = o++;
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
    int d1,d2,d3,d4,d5;
    switch(str.length()) {
      case 1 :
        d1 = Str1ToInt(str.substring(0, 1));
        return dictIndex[d1][4][4][4][4];
      case 2 :
        d1 = Str1ToInt(str.substring(0, 1));
        d2 = Str1ToInt(str.substring(1, 2));
      return dictIndex[d1][d2][4][4][4];
      case 3 :
        d1 = Str1ToInt(str.substring(0, 1));
        d2 = Str1ToInt(str.substring(1, 2));
        d3 = Str1ToInt(str.substring(2, 3));
      return dictIndex[d1][d2][d3][4][4];
      case 4 :
        d1 = Str1ToInt(str.substring(0, 1));
        d2 = Str1ToInt(str.substring(1, 2));
        d3 = Str1ToInt(str.substring(2, 3));
        d4 = Str1ToInt(str.substring(3, 4));
        return dictIndex[d1][d2][d3][d4][4];
      default :
        d1 = Str1ToInt(str.substring(0, 1));
        d2 = Str1ToInt(str.substring(1, 2));
        d3 = Str1ToInt(str.substring(2, 3));
        d4 = Str1ToInt(str.substring(3, 4));
        d5 = Str1ToInt(str.substring(4, 5));
        return dictIndex[d1][d2][d3][d4][d5];
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
