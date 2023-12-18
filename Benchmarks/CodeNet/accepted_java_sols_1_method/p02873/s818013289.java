/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    char[] seq = br.readLine().toCharArray();
    int n = seq.length+1;
    int[] arr = new int[n];
    Arrays.fill(arr, -1);
    int index = n-1;
    while (index>0) {
      if ((index==n-1 || seq[index]=='<') && seq[index-1]=='>') {
        arr[index] = 0;
        while (index-2>=0 && seq[index-2]=='>') {
          arr[index-1] = arr[index] + 1;
          index--;
        }
        arr[index-1] = arr[index] + 1;
      }
      index--;
    }
    if (arr[0]==-1) {
      arr[0] = 0;
    }
    index = 1;
    while (index<n) {
      if (arr[index]==-1) {
        arr[index] = arr[index-1] + 1;
      }
      index++;
    }
    for (int i=0; i<n-1; i++) {
      if (seq[i]=='<' && arr[i]>=arr[i+1])  {
        arr[i+1] = arr[i] + 1;
      }
      if (seq[i]=='>' && arr[i]<=arr[i+1]) {
        arr[i] = arr[i+1] + 1;
      }
    }
    long sum = 0;
    for (int i=0; i<n; i++) {
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
