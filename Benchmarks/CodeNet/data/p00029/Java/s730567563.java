import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String[] words = text.split(" ");
    Arrays.sort(words);    
    String tmp="";
    String frequent_word="";
    String longest_word="";
    int count=0;
    int max_count=0;
    int len=0;
    int max_len=0;
    for(int i=0; i<words.length; i++) {
      if(tmp.equals(words[i])) {
        count++;
      }
      else {
        tmp = words[i];
	count=1;
      }

      if(max_count < count) {
        max_count = count;
	frequent_word = words[i];
      }
      if(max_len < words[i].length()) {
        longest_word=words[i];
	max_len = words[i].length();
      }
    }
    System.out.println(frequent_word+" "+longest_word);
  }
}