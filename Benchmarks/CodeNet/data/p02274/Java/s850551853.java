import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] arrayS = new int[n];
      int i=0;
      for (String val : br.readLine().split(" ")) {
        arrayS[i++] = Integer.parseInt(val);
      }

      BubbleSortD bubble = new BubbleSortD(arrayS);
      int cnt = bubble.bubbleSortD(0, n);

      System.out.println(cnt);
    }
  }
}

class BubbleSortD {

  private int[] target;

  public BubbleSortD(int[] target) {
    this.target = target;

  }

  public int bubbleSortD(int left, int right) {
    int cnt =0;

    if(left+1 < right){
      int mid = (left + right) / 2;
      cnt += bubbleSortD(left, mid);
      cnt += bubbleSortD(mid, right);
      cnt += bubbleSort(left, mid, right);
    }

    return cnt;
  }

  private int bubbleSort(int left, int mid, int right) {
    int cnt = 0;
    int n = right -left;

    for(int i=0,f=1,t; i<n || f==1; i++ ) {
      f=0;
      for(int j=right-1; j>left; j-- ) {
        if( target[j] < target[j-1]) {
          t = target[j];
          target[j] = target[j-1];
          target[j-1] = t;
          cnt++;
          f=1;
        }
      }
    }

    return cnt;
  }

  public int[] getArray() {
    return target;
  }
}
