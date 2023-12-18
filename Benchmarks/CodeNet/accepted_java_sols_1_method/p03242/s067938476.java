import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[]n = N.toCharArray();

    for(int i=0; i<3; i++){
    if(n[i]=='1'){
        n[i]='9';
    }else{
        n[i]='1';
    }
}
    System.out.println(String.valueOf(n));    
      }
}