import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] rec = new int[2], cir = new int[3];

    for(int i=0 ; i<2 ; i++){rec[i] = scan.nextInt();}
    for(int i=0 ; i<3 ; i++){cir[i] = scan.nextInt();}
    if((cir[0] - cir[2]) >= 0 && (cir[0] + cir[2]) <= rec[0] && (cir[1] - cir[2]) >= 0 && (cir[1] + cir[2]) <= rec[1])
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}