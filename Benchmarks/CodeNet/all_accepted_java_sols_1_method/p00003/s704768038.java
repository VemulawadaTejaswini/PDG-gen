import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int j=0;j<i;j++){
		  int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b)){
    	  System.out.println("YES");
      }else{
    	  System.out.println("NO");
      }
		}
	}
}
