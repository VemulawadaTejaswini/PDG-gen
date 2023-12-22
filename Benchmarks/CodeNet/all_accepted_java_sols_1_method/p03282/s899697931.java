import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long K = sc.nextLong();

    int i = 0;
    while(i < K && i < S.length()){
      if(S.charAt(i) != '1'){
        System.out.println(S.charAt(i));
        System.exit(0);
      }else{
        i++;
      }
    }
    System.out.println(1);
  }
}
