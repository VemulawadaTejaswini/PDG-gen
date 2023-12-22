import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char [] answer ;
    answer = new char [1200];
    int n = line.length();
    for(int i=0;i<n;i++){
      char k = line.charAt(i);
      if(Character.isLowerCase(k) == true){
        //Char toUpperCase(char k);
        answer[i] = Character.toUpperCase(k);
      } else {

        answer[i] = Character.toLowerCase(k);
      }
      System.out.print(answer[i]);
    }
    System.out.println();
    sc.close();
  }
}

