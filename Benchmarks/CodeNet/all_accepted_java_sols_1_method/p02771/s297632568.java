import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    for(int i = 0;i<3;i++){
      a[i] = sc.nextInt();
    }
    int ans = 0;
    if(a[0] == a[1] && !(a[0] == a[2])){
      ans = 1;
    }
    if(a[1] == a[2] && !(a[1] == a[0])){
      ans = 1;
    }
    if(a[2] == a[0] && !(a[2] == a[1])){
      ans = 1;
    }
    if(ans == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
