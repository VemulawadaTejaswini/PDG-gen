import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] x = str.split(" ");
    int a = Integer.parseInt(x[0]);
    int b = Integer.parseInt(x[1]);
    int c = Integer.parseInt(x[2]);
    int count = 0;
    for (int i = a; i <= b; i++){
      if((c % i) == 0){
        count++;
      }
    }
    System.out.println(count);
  }
}
