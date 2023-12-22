import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String TAILES = sc.next();
    int sum = 0;

    char anxis = TAILES.charAt(0);
    char next;
    if(anxis == '0'){
      next = '1';
    }else{
      next = '0';
    }

    for(int i=1;i<TAILES.length();i++){
      if(TAILES.charAt(i) != next){
        sum+=1;
      }
      if(next == '0'){
        next = '1';
      }else{
        next ='0';
      }
    }
    System.out.println(sum);
  }
}