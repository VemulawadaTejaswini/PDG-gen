import java.util.*;

public class Main{
  public static void main(String[] args){
    int n,avg=0,max=0,min=0,num;
    Scanner sc = new Scanner(System.in);
    while((n = sc.nextInt()) != 0){
      avg=0;
      for(int i=0;i<n;i++){
        num = sc.nextInt();
        avg += num;
        if(i==0){
          max = num;
          min = num;
        }else{
          if(num > max)max=num;
          if(num < min)min=num;
        }
      }
      avg -= (min+max);
      avg /= (n-2);
      System.out.println(avg);
    }
    sc.close();
  }
}

