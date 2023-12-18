import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int H1 = sc.nextInt();
      int M1 = sc.nextInt();
      int H2= sc.nextInt();
      int M2 = sc.nextInt();
      int t = sc.nextInt();
      int tt= (H2-H1)*60 - Math.abs(M1-M2)-t;
      System.out.println(""+tt);
    }
}