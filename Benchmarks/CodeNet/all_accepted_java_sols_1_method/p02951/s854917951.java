import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = a-b;
				int e = c-d;
      if(e<=0){
        System.out.println('0');
      }else{
				System.out.println(e);
      }
	}
}