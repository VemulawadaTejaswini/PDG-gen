import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    double max = (double) W * (double) H / 2;

    int check = 0;

    if(x + x == W && y + y == H){
      check = 1;
    }

    System.out.println(max + " " + check);

  }

}