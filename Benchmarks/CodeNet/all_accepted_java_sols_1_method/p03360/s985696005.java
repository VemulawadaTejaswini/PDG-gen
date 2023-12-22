import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   int k = sc.nextInt();
   int max = a;
   int maxindex = 0;
   int[] num = new int[]{a, b, c};
    for(int i = 1; i < num.length; i++){
      int j = num[i];
      if(max < num[i]){
        max = j;
        maxindex = i;
      }
    }
    for (int i = 0; i < k; i++ ) {
      max = max * 2;
    }
    if(maxindex == 0){
      System.out.println(max + b + c);
    }else if(maxindex == 1){
      System.out.println(a + max + c);
    }else{
      System.out.println(a + b + max);
    }
  }
}
