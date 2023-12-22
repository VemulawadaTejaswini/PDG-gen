import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int [n];
    int ansMin=0;
    int ansMax = 0;
    int sum = 0;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    int num = sum / n ;
    for(int i = 0; i < n; i++){
      ansMin += (num-a[i]) * (num-a[i]);
    }
    for(int i = 0; i < n; i++){
      ansMax += (num+1-a[i]) * (num+1-a[i]);
    }
    if(ansMin < ansMax) System.out.println(ansMin);
    else System.out.println(ansMax);
  }
}
