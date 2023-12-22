import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    char[] symbols = sc.next().toCharArray();
    for(int i = 0; i < 4; i++){
    if(symbols[i] == '+'){
      a++;
    }else{
      a--;
    }
  }
  System.out.println(a);
    
  }
}