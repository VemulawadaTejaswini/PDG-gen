import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] read = scan.nextLine().split(" ", 3);
    int L = Integer.parseInt(read[0]);
    int R = Integer.parseInt(read[1]);
    int d = Integer.parseInt(read[2]);
    
    int count = 0;
    for (int i=L; i<=R; i++){
      if(i%d == 0){
        count++;
      }
    }
    
    System.out.println(count);
  }
}