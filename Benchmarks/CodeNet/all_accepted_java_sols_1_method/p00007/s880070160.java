import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double debt = 100000;
    for(int i=0; i<n; i++) {
      debt *= 1.05;
      if(debt % 1000 != 0) {
        debt = (Math.floor(debt/1000)+1)*1000;
      }
      else {
        debt = Math.floor(debt);  
      } 
    }    
    System.out.println((int)debt);
  }
}