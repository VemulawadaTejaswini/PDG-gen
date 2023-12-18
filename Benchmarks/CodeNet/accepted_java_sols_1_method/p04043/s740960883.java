import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      
        if(a == 5){
          if(b == 5){
            if(c == 7){
              System.out.println("YES");
            }else{
              System.out.println("NO");
            }
          }else if(b == 7){
            if(c == 5){
              System.out.println("YES");
            }else{
              System.out.println("NO");
            }
          }
        }else if(a == 7){
          if(b == 5){
            if(c == 5){
              System.out.println("YES");
            }else{
              System.out.println("NO");
            }
          }else{
            System.out.println("NO");
          }
        }else{
            System.out.println("NO");
        }
	}
}