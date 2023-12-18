import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[][] inserts = new String[26][size];
    String[] results = new String[size];
    String input;
    String find;

    int[] iIndex = new int[26];
    for (int i = 0; i < 26; i++) {
      iIndex[i] = 0;
    }
    int asciiIndex;
    int fIndex = 0;
    boolean first = true;

    for (int i = 0; i < size; i++) {

      if (sc.next().equals("insert")) {
        input = sc.next();
        asciiIndex = getAsciiIndex(input);
        inserts[asciiIndex][iIndex[asciiIndex]] = input;
        iIndex[asciiIndex]++;
        if (first) {
            first = false;
        }

      } else {
        find = sc.next();

        if (first) {
          results[fIndex] = "no";
          fIndex++;
          continue;
        }

        if (search(find, inserts, iIndex)) {
          results[fIndex] = "yes";
        } else {
          results[fIndex] = "no";
        }
        fIndex++;
      }
    }

    for (int i = 0; i < fIndex; i++) {
      System.out.println(results[i]);
    }
  }

  public static int getAsciiIndex(String input) {
    try {
      return input.substring(0, 1).getBytes("US-ASCII")[0] - 65;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

  public static boolean search(String find, String[][] inserts, int[] iIndex) {
    int asciiIndex = getAsciiIndex(find);

    for (int i = 0; i < iIndex[asciiIndex]; i++) {
      if (inserts[asciiIndex][i].equals(find)) {
        return true;
      }
    }

    return false;
  }
}

