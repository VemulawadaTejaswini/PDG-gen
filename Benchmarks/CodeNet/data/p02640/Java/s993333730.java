import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
      	int x = scn.nextInt();
      	int y = scn.nextInt();
      	if(y % 2 == 1){
          System.out.println("No");
          return;
        }
      	if(x*2>y){
          System.out.println("No");
          return;
        }
        if(x*4<y){
          System.out.println("No");
          return;
        }
      	System.out.println("Yes");
	}
}

