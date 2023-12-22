import java.util.*;
public class Main { //クラス名はMain
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.next());
     	int n2 = Integer.parseInt(sc.next());
     	int n3 = Integer.parseInt(sc.next());
      	int cnt = 0;
      
      	if( n1 == n2 ){
          cnt++;
        }
      	if( n2 == n3 ){
          cnt++;
        }
      	if( n3 == n1 ){
          cnt++;
        }
      
      	if( cnt == 1 ){
       	 System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}