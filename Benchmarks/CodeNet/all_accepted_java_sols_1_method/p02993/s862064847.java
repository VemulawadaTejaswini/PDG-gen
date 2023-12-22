import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //int n=scanner.nextInt();
    //int k=scanner.nextInt();
    String S=scanner.next();
    int flg=0;

    for(int i=0;i<S.length()-1;i++){
      //char str=S.charAt(i);
      if(S.charAt(i)==S.charAt(i+1)){
        flg=1;
        break;
      }
    }

    if(flg==1){
      System.out.println("Bad");
    }
    else{
      System.out.println("Good");
    }



  }
}
