import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    long K = sc.nextLong();
    
    for(int i = 0; i < K; i++){
      if(S.charAt(i) != '1'){
        System.out.println(S.charAt(i));
        break;
      }
      else if(i == K-1){
        System.out.println("1"); 
      }
    }  
  }
}
