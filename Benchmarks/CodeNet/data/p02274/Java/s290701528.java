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

      MergeSort merge = new MergeSort(arrayS);
      int cnt = merge.mergeSort(0, n);

      System.out.println(cnt);
    }
  }
}

class MergeSort {

  static private final int SENTINEL = Integer.MAX_VALUE;

  private int[] target;
  private int[] bufL;
  private int[] bufR;

  public MergeSort(int[] target) {
    this.target = target;
    bufL = new int[target.length/2+2];
    bufR = new int[target.length/2+2];

  }

  public int mergeSort(int left, int right) {
    int cnt =0;

    if(left+1 < right){
      int mid = (left + right) / 2;
      cnt += mergeSort(left, mid);
      cnt += mergeSort(mid, right);
      cnt += merge(left, mid, right);
    }

    return cnt;
  }

  private int merge(int left, int mid, int right) {
    int cnt = 0;
    int n1 = mid - left;
    int n2 = right - mid;
    
    for(int i=0; i<n1; i++)
      bufL[i] = target[left+i];
    bufL[n1] = MergeSort.SENTINEL;

    for(int i=0; i<n2; i++)
      bufR[i] = target[mid+i];
    bufR[n2] = MergeSort.SENTINEL;

    for(int i=0,j=0,k=left,l=0; k<right; k++,l++) {
      if(bufL[i] <= bufR[j]) {
        target[k] = bufL[i++];
        cnt += i-l;
      }
      else {
        target[k] = bufR[j++];
        cnt += n1 + j -l;
      }
    }

    return cnt;
  }

  public int[] getArray() {
    return target;
  }

  public void dispIntArray() {
    StringBuilder s = new StringBuilder();

    for (int i : target) { s.append(i).append(" "); }
    s.setLength(s.length()-1);

    System.out.println(s);
  }
}
