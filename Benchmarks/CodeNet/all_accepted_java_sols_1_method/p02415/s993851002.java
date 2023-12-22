import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\n");

    String str;
    char word[] = new char[1200];
    int num=0;

    int i=0;
    str = sc.next();

    while(i<1200){
      if(i==str.length()){
        System.out.printf("\n");
        break;
      }
      word[i] = str.charAt(i);
      num=(int)word[i];

      if(num>=65 && num<=90) word[i]=(char)(num+32);
      else if(num>=97 && num<=122) word[i]=(char)(num-32);
      System.out.print(word[i]);
      i++;
    }

  }
}

