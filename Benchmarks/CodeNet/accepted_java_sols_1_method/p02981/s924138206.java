import java.util.Scanner;

class Main {
	
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int kei;

    kei = n * a;

    if(kei > b) {
        System.out.println(b);
    } else {
        System.out.println(kei);
    }
    
  }


}