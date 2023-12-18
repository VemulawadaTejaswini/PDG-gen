import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int key = 0;
      String str = sc.nextLine();
      String[] strArr = str.split(" ");
      searchKey:
      for (int i = 0; i < strArr.length; i++) {
        for (int j = 1; j < 27; j++) {
          String strTemp = "";
          for (int k = 0; k < strArr[i].length(); k++) {
            char charTemp = (char)(strArr[i].charAt(k) + j);
            if (charTemp > 'z') {
              charTemp = (char)(charTemp - 26);
            }
            strTemp += String.valueOf(charTemp);
          }
          if (strTemp.equals("the") || strTemp.equals("this") || strTemp.equals("that")) {
            key = j;
            break searchKey;
          }
        }
      }
      String strResult = "";
      for (int i = 0; i < str.length(); i++) {
        char charResult = (char)(str.charAt(i) + key);
        if (charResult > 'z') {
          charResult = (char)(charResult - 26);
        }
        if (charResult < 'a' || charResult > 'z') {
          charResult = str.charAt(i);
        }
        strResult += String.valueOf(charResult);
      }
      System.out.println(strResult);
    }
  }
}