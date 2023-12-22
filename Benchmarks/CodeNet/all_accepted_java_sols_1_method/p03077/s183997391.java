import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = Long.parseLong(scan.nextLine());
    long tmp = 0;
    long max = 0;
    for(int i = 0;i < 5;i ++){
      tmp = Long.parseLong(scan.nextLine());
      tmp = (tmp + n - 1) / tmp;
      if(tmp > max){
        max = tmp;
      }
    }
    System.out.println(max + 4);
  }
}
