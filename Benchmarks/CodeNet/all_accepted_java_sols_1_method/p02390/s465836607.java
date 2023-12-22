import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int S, h, m, s;

    S = sc.nextInt();

    h = S/3600;

    S -= h*3600;

    m=S/60;

    S-= m*60;

    s = S;


    System.out.println( h + ":" + m + ":" + s );
    } 
}
