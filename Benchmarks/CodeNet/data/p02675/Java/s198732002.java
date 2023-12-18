import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n %= 10;
    
    int hons[] = {2,4,5,7,9};
    int pons[] = {0,1,6,8};
    int bons[] = {3};
    
    for(int i = 0; i< hons.length;i++){
    	if(n == hons[i]) System.out.println("hon");
    }
    
    for(int i = 0; i< pons.length;i++){
    	if(n == pons[i]) System.out.println("pon");
    }
    
    for(int i = 0; i< bons.length;i++){
    	if(n == bons[i]) System.out.println("bon");
    }
    
  }
}
