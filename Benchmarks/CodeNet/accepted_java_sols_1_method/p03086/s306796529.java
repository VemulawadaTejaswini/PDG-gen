import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char st;
    char ch[] = {'A','C','G','T'};
    int count = 0;
    int count_max = 0;
    boolean con;
    
    for(int i = 0; i < s.length();i++){
    	st = s.charAt(i);
      	con = true;
      	count++;
      	for(int j = 0; j < 4 && con;j++){
          if(st == ch[j]) con = false;
        }
      	if(con) count = 0;
      	if(count > count_max) count_max = count;
    }
    
    System.out.println(count_max);
  }
}
