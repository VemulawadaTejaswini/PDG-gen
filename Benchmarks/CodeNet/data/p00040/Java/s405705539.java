import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HashMap<Character,Integer> dictCI = new HashMap<Character,Integer>();
    HashMap<Integer,Character> dictIC = new HashMap<Integer,Character>();
    for (int i = 0; i < 26; i++) {
      dictCI.put((char)(i+'a'),i);
      dictIC.put(i,(char)(i+'a'));
    }
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      String str = sc.nextLine();
      String[] strArr = str.split(" ");
      int j = 1;
      int[] key = new int[2];
      searchKey:
      while (true) {
        if (j%2 == 0 || j%13 == 0) {
          j++;
          continue;
        }
        for (int k = 0; k < 27; k++) {
          for (int l = 0; l < strArr.length; l++) {
            String strTemp = "";
            for (int m = 0; m < strArr[l].length(); m++) {
              int intTemp = (dictCI.get(strArr[l].charAt(m))*j + k)%26;
              strTemp += String.valueOf(dictIC.get(intTemp));
            }
            if (strTemp.equals("this") || strTemp.equals("that")) {
              key[0] = j;
              key[1] = k;
              break searchKey;
            }
          }
        }
        j++;
      }
      String strResult = "";
      for (j = 0; j < str.length(); j++) {
        if (str.charAt(j) < 'a' || str.charAt(j) > 'z') {
          strResult += String.valueOf(str.charAt(j));
        }
        else {
          int intResult = (dictCI.get(str.charAt(j))*key[0] + key[1])%26;
          strResult += String.valueOf(dictIC.get(intResult));
        }
      }
      System.out.println(strResult);
    }
  }
}