import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter[] = new int[26];
    while(sc.hasNext()) {
      String str = sc.nextLine();
      str = str.toLowerCase();
      for (int i = 0; i < str.length(); i++) {
        int n = str.charAt(i) - 'a';
        if (n < 0 || n > 25) {
          continue;
        }
        counter[n]++;
      }
    }
    for (int i = 0; i < 26; i++) {
      int n = i + 'a';
      char ch = (char)n;
      System.out.println(ch + " : " + counter[i]);
    }
  }
}