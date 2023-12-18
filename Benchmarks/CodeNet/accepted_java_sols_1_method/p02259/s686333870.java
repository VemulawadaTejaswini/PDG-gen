import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int count = Integer.parseInt(in.readLine());
      String[] arrStr = in.readLine().split(" ");
      int[] arrInt = new int[count];
      for(int i=0; i<count; i++) { arrInt[i] = Integer.parseInt(arrStr[i]); }
      int flag = 1;
      int cntResult = 0;
      while(flag==1) {
        flag = 0;
        for( int j = count-1; j > 0; j-- ) {
          if(arrInt[j] < arrInt[j-1]) {
            int tmp = arrInt[j];
            arrInt[j] = arrInt[j-1];
            arrInt[j-1] = tmp;
            flag = 1;
            cntResult++;
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      for( int i : arrInt ) { sb.append(i).append(" "); }
      System.out.println(sb.toString().trim());
      System.out.println(cntResult);
    } catch (IOException e) {
    }
  }
}