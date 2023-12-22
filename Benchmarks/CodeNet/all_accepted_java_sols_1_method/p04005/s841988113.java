import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long[] n=new long[3];
    for(int i=0;i<3;i++){
      n[i]=sc.nextInt();
    }
    if(n[0]%2==0||n[1]%2==0||n[2]%2==0){
      System.out.println(0);
    }else{
      Arrays.sort(n);
      System.out.println(n[0]*n[1]);
    }
  }
}
