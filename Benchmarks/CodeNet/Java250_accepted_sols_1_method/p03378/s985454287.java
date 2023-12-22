import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int a[] = new int [m];
    for(int i = 0;i < m;i++){
      a[i] = sc.nextInt();
    }
    int count1 = 0;
    int count2 = 0;
    for(int i = x;i < n+1;i++){
      for(int j = 0;j < m;j++){
        if(i == a[j]){
          count1++;
        }
      }
    }
    for(int i = x;i != n;i--){
      for(int j = 0;j < m;j++){
        if(i == a[j]){
          count2++;
        }
        if(i == 0){
          i = n + 1;
        }
      }
    }
    if(count1 < count2){
      System.out.println(count1);
    }else{
      System.out.println(count2);
    }
  }
}