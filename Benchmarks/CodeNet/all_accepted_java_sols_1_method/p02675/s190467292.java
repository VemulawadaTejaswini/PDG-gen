import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M =N % 10 ;
        String S="";
        switch(M){
          case 2:
          case 4:
          case 5:
          case 7:
          case 9:
            S="hon";
            break;
          case 0:
          case 1:
          case 6:
          case 8:
            S="pon";
            break;
          case 3:
            S="bon";
            break;
        }
      System.out.println(S);
	}
  
      
}