import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min=0,max=0,n,num;
    long sum=0L;
    n = sc.nextInt();
    for(int i=1;i <= n;i++){
      num = sc.nextInt();
      if(i == 1){
        min = num;
        max = num;
      }else{
        if(num < min)min = num;
        if(num > max)max = num;
      }
      sum += num;
    }
    System.out.println(min + " " + max + " " + sum);
    sc.close();
  }
}

