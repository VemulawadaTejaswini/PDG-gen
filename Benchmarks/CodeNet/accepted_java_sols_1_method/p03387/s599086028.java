import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int [3];
    for(int i = 0;i < 3;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int count = 0;

    if(a[2] % 2 != (a[0] + a[1] + a[2]) % 2){
      a[0]++;
      a[2]++;
      count++;
    }

    while(a[0] != a[2] || a[1] != a[2]){
      if(a[1] != a[2]){
        a[0]++;
        a[1]++;
        count++;
      }else{
        a[0] += 2;
        count++;
      }
    }


    System.out.println(count);
  }
}