import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] aji = new int[n];
    int ajisum = 0;
    for(int count = 0;count<n;count++){
      aji[count] = l+(count+1)-1;
      ajisum += aji[count];
    }
    int eat = 0;
    if(l<0){
      if(l+n<=0){
        eat = aji[n-1];
      }
    }else if(l>0){
      eat = aji[0];
    }
    System.out.println(ajisum-eat);
  } 
}