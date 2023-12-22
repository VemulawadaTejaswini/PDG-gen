import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] seqS = new int[n];
      String line = br.readLine();
      StrSplitToInt stoi = new StrSplitToInt(line, " ");
      for (int i=0; i<n; i++)
        seqS[i] = stoi.nextInt();

      int q = Integer.parseInt(br.readLine());
      String[] lines = br.readLine().split(" ");
      
      int cnt=0;
      for (String ref : lines) {
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

class StrSplitToInt {
  String s;
  String split;
  int currentPos;
  int nextPos;
  int endPos;

  public StrSplitToInt(String s,String split) {
    this.s = s;
    this.split = split;
    currentPos = 0;
    nextPos = s.indexOf(split, currentPos);
    endPos = s.length();
  }

  public int nextInt() {
    if( currentPos < endPos ) {
      String i = s.substring(currentPos, nextPos);
      currentPos = nextPos + split.length();
      nextPos = s.indexOf(split, currentPos);
      if(nextPos == -1) nextPos = endPos;

      return Integer.parseInt(i);
    }
    else
      return -1;
  }
}
