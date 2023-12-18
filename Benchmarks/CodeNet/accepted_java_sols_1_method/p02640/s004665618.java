import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int y = sc.nextInt();
      	boolean ans = false;
		for(int i=0;i<=x;i++){
			if( i*4 + (x-i)*2 == y ){
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