import java.util.Scanner;

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int all = sc.nextInt();

    int fault = 0;
    for(int i = 0;i<all;i++){
      if(sc.nextInt() != i+1){
        fault++;
      }
    }
    System.out.println(fault<=2 ? "YES" : "NO" );
  }
}
    
    
