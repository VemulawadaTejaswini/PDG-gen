import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> a = new ArrayList<String>();
    while (scanner.hasNext()) {
      a.add(scanner.nextLine());
    }
    Collections.sort(a);
    String preWord = "";
    String page = "";
    for (int ii = 0; ii < a.size(); ii++) {
      String[] works = a.get(ii).split(" ");
      if (ii != 0 && !works[0].equals(preWord)) {
        System.out.println(preWord);
        System.out.println(aaaa(page));
        page = "";
      }
      page += works[1] + " ";
      preWord = works[0];
    }
    if (preWord.length() != 0) {
      System.out.println(preWord);
    }
    if (page.length() != 0) {
      System.out.println(aaaa(page));
    }
  }

  private static String aaaa (String aa) {
    String[] works = aa.trim().split(" ");
    for (int ii = 0; ii < works.length; ii++) {
      works[ii] = "000" + works[ii];
      works[ii] = works[ii].substring(works[ii].length() - 4);
    }
    Arrays.sort(works);
    String out = "";
    for (int ii = 0; ii < works.length; ii++) {
      out += Integer.parseInt(works[ii]) + " ";
    }
    return out.trim();
  }
}