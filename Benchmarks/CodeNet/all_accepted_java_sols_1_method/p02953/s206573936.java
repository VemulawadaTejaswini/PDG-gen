import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    a[0] = sc.nextInt();
    int max = a[0];
    String s = "Yes";
    for(int i = 1;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]>max){
        max = a[i];
      }
      if(max-1>a[i]){
        s = "No";
        break;
      }
    }
    System.out.println(s);    
  } 
}