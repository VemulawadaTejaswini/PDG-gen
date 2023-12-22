import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int total = 0;
    total = n<10 ? n:n<100 ? 9:n<1000 ? n-90:n<10000 ? 909:n<100000 ? n-9090:90909;
    System.out.println(total);    
  } 
}