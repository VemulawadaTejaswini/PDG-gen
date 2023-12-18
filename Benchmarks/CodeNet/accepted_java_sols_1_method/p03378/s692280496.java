import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int x = scan.nextInt();
    int left = 0;
    int right = 0;
    int temp = 0;
    for(int i=0; i<m; i++){
      temp = scan.nextInt();
      if(temp < x)left++;
      else{
        right++;
      }
    }
    System.out.println(Math.min(left, right));

  }
}