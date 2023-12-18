import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int line2 = sc.nextInt();
      	int ans = 0;
      if(line == 1){
        if(line2 == 2){
          ans = 3;
        }else{
          ans = 2;
        }
      }
      if(line == 2){
        if(line2 == 1){
          ans = 3;
        }else{
          ans = 1;
        }
      }
      if(line == 3){
        if(line2 == 1){
          ans = 2;
        }else{
          ans = 1;
        }
      }
      System.out.println(ans);
    }
}