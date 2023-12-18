import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    long sum = 0;
    int min = 1000000;
    int max = -1000000;
    for(int x = 0; x < n; x++){
      a[x] = sc.nextInt();
      sum = sum + a[x];
      if(min > a[x]){
        min = a[x];
      }
      if(max < a[x]){
        max = a[x];
      }
    }
    System.out.println(min+" "+max+" "+sum);
  }
}
