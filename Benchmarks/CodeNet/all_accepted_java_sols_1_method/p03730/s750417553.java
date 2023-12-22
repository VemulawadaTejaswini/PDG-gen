import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int A = sc.nextInt();
	  int B = sc.nextInt();
	  int C = sc.nextInt();
	  int x=0;
	  for(int i=1; i<=B;i++) {  //一巡
	    if((A*i)%B==C) {
		    x++;
		    break;
	    }
	  }
	  if(x==1)System.out.print("YES");
	  else System.out.print("NO");
	  sc.close();
    }
}