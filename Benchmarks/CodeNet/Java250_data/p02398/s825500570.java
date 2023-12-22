import java.util.Scanner;

class Main{
  public static void main(String[] arg){
  	int a, b, c, cnt=0;
  	Scanner in = new Scanner(System.in);
  	a = in.nextInt();
  	b = in.nextInt();
  	c = in.nextInt();
  	for(int i=a; i<=b; i++){
  		if(c/i > 0 && c%i == 0){
  			cnt++;
  		}
  	}
  	System.out.println(cnt);
	}
}