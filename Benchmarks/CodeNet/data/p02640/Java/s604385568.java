import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	int x = sc.nextInt();
    int y = sc.nextInt();
    
    int kame = (y-2*x)/2;
    int turu = x-kame;
    
    if(turu>=0 && kame>=0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
