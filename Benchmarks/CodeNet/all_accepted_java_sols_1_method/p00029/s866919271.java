import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList<String> strLlist = new LinkedList<String>();
    while (sc.hasNext()) {
      strLlist.add(sc.next());
    }
    String[] strArr = (String[])strLlist.toArray(new String[0]);
    int[] times = new int[strArr.length];
    int maxTimes = 0;
    int maxLength = 0;
    for (int i =0; i < strArr.length; i++) {
      for (int j =0; j < strArr.length; j++) {
        if (strArr[i].equals(strArr[j])) {
          times[i]++;
        }
      }
      if (times[i] > maxTimes) {
        maxTimes = times[i];
      }
      if (strArr[i].length() > maxLength) {
        maxLength = strArr[i].length();
      }
    }
        String mode = null;
        String longest = null;
    for (int i =0; i < strArr.length; i++) {
      if (times[i] == maxTimes) {
        mode = strArr[i];
      }
      if (strArr[i].length() == maxLength) {
        longest = strArr[i];
      }
    }
    System.out.println(mode + " " + longest);
  }
}