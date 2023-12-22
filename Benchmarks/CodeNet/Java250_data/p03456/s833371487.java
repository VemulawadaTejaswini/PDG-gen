import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      
      String a = sc.next();
      String b = sc.next();
      int ab = Integer.parseInt(a + b);
      for(int i = 1; i <= 1000; i++){
        if(Math.pow(i,2) == ab){
          myout("Yes");
          return;
        }
      }
      myout("No");
	}
}
