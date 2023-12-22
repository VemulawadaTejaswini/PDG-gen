import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	int Y = sc.nextInt();
      	boolean ans = false;
      	for(int i=0;i<X+1;i++){
            if( i*2 + (X-i)*4 == Y ){
              ans = true;
            }    
        }
      if( ans ){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }       
	}
}