import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String s = sc.nextLine();
    final String t = sc.nextLine();
    int max = 0;
 	int j = 0;
    
    for(int i = 0; i < t.length(); i++) {  
      while(s.contains(t.substring(i, j))) {
        j++;
      }
      if(max < j) {
        max = j;
      }
    }
    
    System.out.println(s.length() - (max-1));
  }
}
import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String s = sc.nextLine();
    final String t = sc.nextLine();
    int max = 0;
    
    for(int i = 0; i < t.length(); i++) {  
 	  int j = 0;
      while(s.contains(t.substring(i, j))) {
        j++;
      }
      if(max < j) {
        max = j;
      }
    }
    
    System.out.println(s.length() - (max-1));
  }
}
提出情報
