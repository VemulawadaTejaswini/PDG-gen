import java.util.Scanner;
import java.util.Arrays; 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] letters = sc.next().toCharArray();
    Arrays.sort(letters);
    if(letters[0] == letters[1] && letters[2] == letters[3] && letters[2] != letters[1]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}