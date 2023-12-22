import java.util.Scanner;	
public class Main {
    public static void main(String[] args) throws Exception {
    Scanner stdIn= new Scanner(System.in);
    int K=stdIn.nextInt();
    String S = stdIn.next();
    for(int t=0;t<K;t++){
       if(S.length()<t+1)break;   
    System.out.print(S.charAt(t));
    }
    if(S.length()>K)System.out.print("...");
  }
}
 
