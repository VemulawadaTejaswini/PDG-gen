import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int X = sc.nextInt();
   int Y = sc.nextInt();
   
   if(X==1 && Y==1)      System.out.println(1000000);
   else {
     int money = 0;
     if( X == 1) money += 300000;
     if( Y == 1) money += 300000;
     if( X == 2) money += 200000;
     if( Y == 2) money += 200000;
     if( X == 3) money += 100000;
     if( Y == 3) money += 100000;
     System.out.println(money);
   }
   
 }
}