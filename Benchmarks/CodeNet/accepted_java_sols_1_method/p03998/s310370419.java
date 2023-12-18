import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] str = new String[3];
    int[] len = new int[3];
    
    for(int i = 0; i < 3; i++){
      str[i] = scan.next();
      len[i] = str[i].length();
    }
    
    int a, b, c;
    char work;
    
    a = 0;
    b = 0;
    c = 0;
    
    work = str[0].charAt(0);
    len[0]--;
    a++;
    
    while(true){
      if(work == 'a'){
        if(len[0] == 0){
          System.out.println("A");
          return;
        }
        work = str[0].charAt(a);
    	len[0]--;
    	a++;
      }
      else if(work == 'b'){
        if(len[1] == 0){
          System.out.println("B");
          return;
        }
        work = str[1].charAt(b);
    	len[1]--;
    	b++;
      }
      else{
        if(len[2] == 0){
          System.out.println("C");
          return;
        }
        work = str[2].charAt(c);
    	len[2]--;
    	c++;
      }
    }
  }

}