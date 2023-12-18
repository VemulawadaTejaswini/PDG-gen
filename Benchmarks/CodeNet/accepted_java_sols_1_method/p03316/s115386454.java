import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int q = N;
    int sum = 0;

    while(q != 0){
      sum += q%10; //qの1の位をsumに加える
      q /= 10; //qの1の位を消したものを新たなqとする
    }

    System.out.println(N%sum == 0? "Yes":"No");
  }
}
