import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[9];
    int ans = 0;

    for(int i = 0; i < 9; i++){
      a[i]= sc.nextInt();
    }

    //0-1 = 3-4 = 6-7
    int b11 = a[0] - a[1];
    int b12 = a[3] - a[4];
    int b13 = a[6] - a[7];
    //1-2 = 4-5 = 7-8
    int b21 = a[1] - a[2];
    int b22 = a[4] - a[5];
    int b23 = a[7] - a[8];
    //2-0 = 5-3 = 8-6
    int b31 = a[2] - a[0];
    int b32 = a[5] - a[3];
    int b33 = a[8] - a[6];

    if(b11 == b12){if(b12 ==b13){
      if(b21 == b22){if(b22 == b23){
        if(b31 == b32){if(b32 == b33){
          ans++;
        }}
      }}
    }}

    if(ans == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}