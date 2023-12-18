import java.util.Scanner;

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    int sum = 0;
    while(sc.hasNext()){
      int newone = sc.nextInt();
      if(newone > max){
        max = newone;
      }
      sum = sum + newone;
    }
    sum = sum - max;
    System.out.println(max < sum ? "Yes" : "No");
  }
}
