import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	int x = sc.nextInt();
    int y = sc.nextInt();
    
    boolean flag = true;
    double Kame = (y-2*x)/2;
    int kame = (int)Kame;
    if(Kame!=kame) flag = false;
    if(kame<0) {
      flag = false;
    }
    int turu = x-kame;
    if(turu<0) flag = false;
    if(turu+kame!=x || 2*turu+4*kame!=y) flag = false;
    
    if(flag == true){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
