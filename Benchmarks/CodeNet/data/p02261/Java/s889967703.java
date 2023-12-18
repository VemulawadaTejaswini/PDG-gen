import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int count = Integer.parseInt(in.readLine());
      String[] inArr = in.readLine().split(" ");
      String[] bArr = Sort.bubbleSort(inArr);
      String[] sArr = Sort.selectionSort(inArr);
      StringBuilder bubbleSb = new StringBuilder();
      for(String str : bArr) { bubbleSb.append(str).append(" "); }
      StringBuilder selectSb = new StringBuilder();
      for(String str : sArr) { selectSb.append(str).append(" "); }
      System.out.println(bubbleSb.toString().trim());
      System.out.println("Stable");
      System.out.println(selectSb.toString().trim());
      if(Sort.isStable(inArr, sArr)) {
        System.out.println("Stable");
      } else {
        System.out.println("Not stable");
      }
    } catch(IOException e) {
    }
  }
}

class Sort {
  public static String[] bubbleSort(String[] arr) {
    String[] bArr = arr.clone();
    for(int i=0; i<bArr.length; i++) {
      for(int j=bArr.length-1; j>i; j--) {
        if(Sort.compCard(bArr[j], bArr[j-1]) == 2) {
          String tmp = bArr[j];
          bArr[j] = bArr[j-1];
          bArr[j-1] = tmp;
        }
      }
    }
    return bArr;
  }

  public static String[] selectionSort(String[] arr) {
    String[] sArr = arr.clone();
    for(int i=0; i<sArr.length; i++) {
      int minj = i;
      for(int j=i; i<sArr.length; j++) {
        if(Sort.compCard(sArr[minj], sArr[j]) == 1) { minj = j; }
      }
      if(i != minj) {
        String tmp = sArr[i];
        sArr[i] = sArr[minj];
        sArr[minj] = tmp;
      }
    }
    return sArr;
  }

  public static int compCard(String str1, String str2) {
    int i = Integer.parseInt(str1.substring(1));
    int j = Integer.parseInt(str2.substring(1));
    if(i > j) {
      return 1;
    } else if(i == j) {
      return 0;
    } else {
      return 2;
    }
  }

  public static boolean isStable(String[] in, String[] out) {
    int cnt = in.length;
    for(int i=0; i<cnt; i++) {
      for(int j=i; j<cnt; j++) {
        if(in[i] == in[j]) {
          for(int k=0; k<cnt; k++) {
            for(int l=k; l<cnt; l++) {
              if(Sort.compCard(out[k], in[j])==0 && Sort.compCard(out[l], in[i])==0) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;  
  }
}