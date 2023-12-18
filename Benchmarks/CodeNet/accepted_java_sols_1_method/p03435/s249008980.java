import java.util.*;

public class Main{ 
  
  public static void main(String[] args) throws Exception{
    
    Scanner sc = new Scanner(System.in);
    
    int[] math = new int[9];
    for(int i = 0; i < 9; ++i){
      math[i] = sc.nextInt();
    }
    
    int a = math[1]-math[0];
    int b = math[4]-math[3];
    int c = math[7]-math[6];
    
    int d = math[2]-math[0];
    int e = math[5]-math[3];
    int f = math[8]-math[6];
    
    int g = math[3]-math[0];
    int h = math[4]-math[1];
    int i = math[5]-math[2];
      
    int j = math[6]-math[0];
    int k = math[7]-math[1];
    int l = math[8]-math[2];
      
    
    if((a == b && b == c && c ==a)
        && (d == e && e == f && f ==d)
        && (g == h && h == i && i ==g)
        && (j == k && k == l && l ==j)){
      System.out.println("Yes");
    }else{
       System.out.println("No");
    } 
  }
} 
