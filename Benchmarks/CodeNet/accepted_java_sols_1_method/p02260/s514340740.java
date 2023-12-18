import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int count = Integer.parseInt(in.readLine());
      int[] iArr = new int[count];
      String[] sArr = in.readLine().split(" ");
      for(int i=0; i<sArr.length; i++) {
        iArr[i] = Integer.parseInt(sArr[i]);
      }
      int swapCount = 0;
      for(int i = 0; i < iArr.length; i++) {
        int minj = i;
        for(int j = i; j < iArr.length; j++) {
          if(iArr[j] < iArr[minj]) { minj = j; }
        }
        if(minj != i) {
          int tmp = iArr[minj];
          iArr[minj] = iArr[i];
          iArr[i] = tmp;
          swapCount++;
        }
      }
      StringBuilder sb = new StringBuilder();
      for(int i : iArr){
        sb.append(i).append(" ");
      }
      System.out.println(sb.toString().trim());
      System.out.println(swapCount);
    } catch (IOException e) {}
  }
}