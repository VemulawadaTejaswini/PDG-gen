import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long H = scan.nextLong();
    long monster = 1;
    long count = 0;
    while(H > 0){
    count += monster;
    monster = 2 * monster;
    H = H / 2;
    }
    System.out.println(count);
  }
}

