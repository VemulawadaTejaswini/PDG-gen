import java.util.*;
public class Main {
  //公式解説見たバージョン
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int allcount = 0;
    for(int i = 1; i < N; i++){
      allcount += (N-1) / i;
    }

    System.out.println(allcount);	
  }
  //これは思いつかなかったです！！Cで回す必要すらないとは…
}