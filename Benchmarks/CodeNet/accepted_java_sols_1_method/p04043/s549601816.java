import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      int i = 0;
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      if(a==7){
        i++;
      }
            if(b==7){
        i++;
      }
            if(c==7){
        i++;
      }
      
      if(i == 1){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
	}
}
