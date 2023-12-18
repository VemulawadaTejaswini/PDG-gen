import java.util.Scanner;


class Main{
  public static void main(String[] args){

    double debt = 100000;
    double mo = 0.05;
    int turm = new Scanner(System.in).nextInt();
    while(turm>0){
      debt = debt*1.05;
      debt = Math.ceil(debt/1000)*1000;
      turm--;
    }
    System.out.println((int)debt);

  }
}