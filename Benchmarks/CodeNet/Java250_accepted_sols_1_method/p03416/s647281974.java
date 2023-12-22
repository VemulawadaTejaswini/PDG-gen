import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int array[] = new int[5];
    int cnt = 0;
   for(int i=A; i<=B; i++){
     int n =i;
     int index =0;
     while(n>0){
       array[index] = n%10;
       n=n/10;
       index++;
     }
     if(array[0]==array[4] && array[1] == array[3]){
     cnt++;
     }
   }
    System.out.println(cnt);
  }
}