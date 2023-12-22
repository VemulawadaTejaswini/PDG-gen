import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    int max = 0;
    int pnt = -1;
    for(int i = 0;i<n;i++){
      l[i] = sc.nextInt();
      if(max < l[i]){
        max = l[i];
        pnt = i;
      }
    }
    int total = 0;
    for(int i = 0;i<n;i++){
      if(i == pnt)continue;
      total+=l[i];
    }
    if(max<total){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
