import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    for(int  i = 0;i<3;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int count = 0;
    while(a[0]!=a[2]){
      count++;
      if(a[2]-a[0]>=2){
        a[0]+=2;
      }else{
        a[0]++;
        a[1]++;
      }
      Arrays.sort(a);
    }
    System.out.println(count);
  }
}
