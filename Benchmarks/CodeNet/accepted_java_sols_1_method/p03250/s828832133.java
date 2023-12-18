import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  //int n = sc.nextInt();
  int a[] = new int[3];
  for(int i=0; i<a.length; i++){
  a[i] = sc.nextInt();
  }
  Arrays.sort(a);
  
  int a_last = a[a.length-1]*10;
  int a_last_1 = a_last+a[a.length-2];
  int a_last_2 = a_last_1+a[a.length-3];
  System.out.println(a_last_2);

  }
}