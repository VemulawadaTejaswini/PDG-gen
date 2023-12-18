import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int M = sc.nextInt();
    
    int i = 0;
    while(H > 0){
      H = H - M;
      i++;
    }
    System.out.println(i);
  }
}
