import java.util.*;
public class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);

    int Na = sc.nextInt();
    int Nb = sc.nextInt();
    int Nc = sc.nextInt();
    int Nd = sc.nextInt();
    int Ne = sc.nextInt();
    int k = sc.nextInt();
   	if(Ne-Na<=k)System.out.println("Yay!");
    else System.out.println(":(");
 }
}