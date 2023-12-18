import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int sum=0;
  int no_fruits = sc.nextInt();
  int[] price = new int[n];
  for(int i=0; i<n; i++)
    price[i] = sc.nextInt();
  Arrays.sort(price);
  for(int i=0; i<no_fruits; i++){
    sum += price[i];
  }
  System.out.print(sum);
}
}