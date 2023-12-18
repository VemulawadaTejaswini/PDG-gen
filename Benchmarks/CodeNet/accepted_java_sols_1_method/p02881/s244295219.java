import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long in = sc.nextLong();
    int out = 0;
    for(int i = 1; i <= Math.sqrt(in); i++){
      if(in % i == 0){
        out = i;
      }
    }
    System.out.println(out + (in / out) - 2);
  }
}
