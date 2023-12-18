import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      String S = sc.next();
      int output = 0;
      int one = 0;
      int zero = 0;
      for(int i = 0; i < S.length(); i++){
        String tmp = S.substring(i , i + 1);
        if(tmp.equals("1")){
          if(zero > 0){
            //System.out.println("通過1");
            zero--;
            output += 2;
          }else{
            //System.out.println("通過2");
          	one++;
          }
        }else{
          if(one > 0){
            //System.out.println("通過3");
            one--;
            output += 2;
          }else{
            //System.out.println("通過4");
          	zero++;
          }
        }
      }
      System.out.println(output);
	}
}
