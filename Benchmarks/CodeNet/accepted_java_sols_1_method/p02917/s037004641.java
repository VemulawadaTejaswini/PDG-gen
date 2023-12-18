import java.util.Scanner;
//import java.util.Arrays;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a-1];
    int[] c = new int[a];
    int ans = 0;
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    c[0] = b[0];
    c[a-1] = c[a-2];
    for(int j = 1;j<b.length;j++){
      if(b[j-1] <= b[j]){
        c[j] = b[j-1];
      }else{
        c[j] = b[j];
      }
      c[a-1] = b[a-2];
    }
    //System.out.println(Arrays.toString(c));
    for(int x = 0;x < c.length;x++){
      ans +=c[x];
    }
    System.out.println(ans);
  }
}