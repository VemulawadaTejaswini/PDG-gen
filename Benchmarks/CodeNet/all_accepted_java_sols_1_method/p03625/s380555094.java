import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] a = new int[n];
  long h = 0;
  long w = 0;
  for(int i = 0; i < n; i++){
    a[i] = sc.nextInt();
  }
  Arrays.sort(a);
  boolean hexist = false;
  for (int i = n-2;i >= 0;i--){
    if (a[i] == a[i+1]){
      if (hexist){
        w = (long)a[i];
        break;
      }
      else{
        hexist = true;
        h = (long)a[i];
        a[i] = 0;
      }
    }
  }
  System.out.println(h*w);
}}