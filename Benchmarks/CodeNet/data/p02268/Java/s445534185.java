import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] seqS = new int[n];
      String[] line = br.readLine().split(" ");
      int c=0;
      for (String s : line)
        seqS[c++] = Integer.parseInt(s);

      int q = Integer.parseInt(br.readLine());
      line = br.readLine().split(" ");
      
      int cnt=0;
      for (String ref : line) {
        if( isExistSeachByBinary(seqS, Integer.parseInt(ref)) )
          cnt++;
      }

      System.out.println(cnt);
    }
  }

  static boolean isExistSeachByBinary(int[] tar, int ref) {
    int left = 0;
    int right= tar.length;
    int mid;
    while( left < right ) {
      mid  = (left + right) / 2;
      if( tar[mid] > ref ) right = mid;
      else if(tar[mid] < ref ) left = mid + 1;
      else return true;
    }

    return false;
  }
}
