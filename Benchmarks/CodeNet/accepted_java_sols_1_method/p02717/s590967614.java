import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    
    int free = x;
    x = y;
    y = free;
    free = x;
    x = z;
    z = free;
    
    System.out.println(x+" "+y+" "+z);
  }
}