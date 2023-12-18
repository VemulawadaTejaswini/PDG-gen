import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	int Y = sc.nextInt();
      	boolean ans = false;
      	for(int i=0;i<X+1;i++){
          for(int j=X-i;j>=0;j++){
            if( i*2 + j*4 == Y ){
              ans = true;
            }
          }
        }
          System.out.println(ans);
        }
	}
}
  /*
        if( (int)s.charAt(0)-48 >= 0 && (int)s.charAt(0)-48 <=48 ){
*/