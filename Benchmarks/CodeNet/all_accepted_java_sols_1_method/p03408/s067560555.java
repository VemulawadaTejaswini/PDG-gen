import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] a = new String[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.next();
    }
    int m = sc.nextInt();
    String[] b = new String[m];
    for(int i = 0;i<m;i++){
      b[i] = sc.next();
    }

    int max = -1000;
    for(int i = 0;i<n;i++){
      if(a[i].equals("")){
        continue;
      }
      int point = 0;
      for(int j = 0;j<n;j++){
        if(a[i].equals(a[j])){
          point++;
        }
      }
      for(int j = 0;j<m;j++){
        if(a[i].equals(b[j])){
          point--;
        }
      }
      max = Math.max(max,point);
    }
    if(max<0){
      max=0;
    }
    System.out.println(max);
  }
}
