import java.util.Scanner;

//private static int min,max,va;
//private static long total;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();//cnt for loop

    int min,max,va;
    long total;

    va = sc.nextInt();
    min = va;
    max = va;
    total = va;

    for(int i = 0;i<cnt-1;i++){//total loop nuber is cnt minus one va. 
      va = sc.nextInt();
      if(va < min){
        min = va;
      }
      if(va > max){
        max = va;
      }

total = total + va;
    }

System.out.println(min+" "+max+" "+total);
  }

}
