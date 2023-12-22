import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int num = 0;
    int sum = 0;
    for(int i=0;i<N.length();i++){
      num = Integer.parseInt(N.substring(i,i+1));
      sum += num;
    }
    if((Integer.parseInt(N) % sum) == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}