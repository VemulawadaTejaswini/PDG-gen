import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//int n = sc.nextInt();
      int[] num = new int[5];
      int tmp = 0;
      for(int i=0;i<5;i++){
        num[i] = sc.nextInt();
        if( num[i] != i + 1 ){
          tmp = i+1;
        }
      }
      System.out.println(tmp);
      
	}
}
  /*
        if( (int)s.charAt(0)-48 >= 0 && (int)s.charAt(0)-48 <=48 ){
*/