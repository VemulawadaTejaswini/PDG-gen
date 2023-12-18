import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
    int k = 0;
    if(H%A == 0){
        System.out.println(H/A);
        return;
    }else{
        System.out.println(H/A +1);
    }
        }    
}
