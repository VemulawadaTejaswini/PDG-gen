import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char c;
    char[] ap = new char[] {'A','B','C','D','E','F','G','H','I','J','K',
                              'L','M','N','O','P','Q','R','S','T','U',
                              'V','W','X','Y','Z'};
    int[] count = new int[26];
    while(sc.hasNextLine()){
      String s = sc.nextLine();
      for(int i= 0;i < s.length();i++){
        c = s.charAt(i);
        if(c >= 'A' && c <= 'Z'){
          count[c-'A']++;
        }else if(c >= 'a' && c <= 'z'){
          count[c-'a']++;
        }
      }
    }
    for(int i = 0;i < 26;i++){
      ap[i] += 'a' - 'A';
      System.out.println(ap[i] + " : " + count[i]);
    }
    sc.close();
  }
}

