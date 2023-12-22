import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int min = -1000000;
    int max = 1000000;
    int black[] = new int[2*k-1];
    for(int i=0;i<2*k-1;i++){
      black[i]=x-k+i+1;
    }
    for(int i=0;i<2*k-1;i++){
      if(black[i]>=min&&black[i]<=max){
        System.out.print(black[i]+" ");
      }
    }    
  }
}