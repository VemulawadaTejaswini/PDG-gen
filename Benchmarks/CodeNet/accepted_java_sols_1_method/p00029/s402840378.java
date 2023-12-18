import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] str = line.split(" ");
    String maxLengthStr = "";
    int maxLength = -1;
    Map<String, Integer> strMap = new HashMap<String, Integer>();
    String maxWordCountStr = "";
    int maxWorkCount = -1;
    for (int ii = 0; ii < str.length; ii++) {
      if (str[ii].length() > maxLength) {
        maxLength = str[ii].length();
        maxLengthStr = str[ii];
      }
      if (strMap.get(str[ii]) == null) {
        strMap.put(str[ii], 1);
      } else {
        strMap.put(str[ii], strMap.get(str[ii]) + 1);
      }
    }

    for (String key : strMap.keySet()) {
      int value = strMap.get(key);
      if (value > maxWorkCount) {
        maxWorkCount = value;
        maxWordCountStr = key;
      }
    }

    System.out.println(maxWordCountStr + " " + maxLengthStr);
  }
}