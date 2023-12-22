import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[]n = N.toCharArray();
    
    int cou = 0;
    for(int i=0; i<3; i++){
      if(n[i]=='7'){
        cou++;
      }
    }
    if(cou>0){
    System.out.println("Yes");
      }else{
	System.out.println("No");
      }
      }
}