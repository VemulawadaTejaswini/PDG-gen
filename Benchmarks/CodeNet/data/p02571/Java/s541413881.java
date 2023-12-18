import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String s = sc.nextLine();
    final String t = sc.nextLine();
 	int j = 1;
    
    for(int i = 0; i < t.length(); i++) {  
      while(s.contains(t.substring(i, j))) {
        j++;
      }
    }
    
    System.out.println((s.length() - (j-1)).toString());
  }
}