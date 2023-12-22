import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr1 = new String[4];
    arr1[0]="AC";
    arr1[1]="WA";
    arr1[2]="TLE";
    arr1[3]="RE";
    int[] arr = new int[4];
    for(int i=0;i<n;i++){
      String a = sc.next();
      if(a.equals("AC")){
        arr[0]++;
      }
      else if(a.equals("WA")){
        arr[1]++;
      }
      else if(a.equals("TLE")){
        arr[2]++;
      }
      else if(a.equals("RE")){
        arr[3]++;
      }
    }
    for(int i=0;i<4;i++){
      System.out.println(arr1[i]+" "+"x"+" "+arr[i]);
    }
  }
}