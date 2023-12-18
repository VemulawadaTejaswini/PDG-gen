import java.util.Scanner;
public class P01{

public P01(){
Scanner scan = new Scanner(System.in)
for(int w; scan.hasNextInt() && w >= 0;){
 System.out.println( 4280-getCost(w));
}
}
public int getCost(int w){
 int cost = 1150;
 for (int i = 11; i <= w; i++ ){
 if ( i <= 20 ) cost += 125;
 else if ( 30 < i ) cost += 160;
 else cost += 140;
 }
 return cost;
}
public static void main(String[] args){
 P01 p01 = new P01();
 }
}