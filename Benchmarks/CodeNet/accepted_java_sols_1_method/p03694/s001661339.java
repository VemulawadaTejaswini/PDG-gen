import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer[] street = new Integer[n];
    for(int i=0; i<n; i++){
      street[i]=sc.nextInt();
    }
    Arrays.sort(street);
    int sum=0;
    for(int i=0; i<n-1; i++){
      sum+=street[i+1]-street[i];
    }
    System.out.println(sum);
  }
}