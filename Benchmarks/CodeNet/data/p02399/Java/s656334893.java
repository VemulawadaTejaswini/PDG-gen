import java.io.*;
 import java.util.*;

public class Main{
static public void main(String args[]){
Scanner scan=new Scanner(System.in);
Calculate calc = new Calculate(scan.nextInt(),
								scan.nextInt());
	calc.show();
}
}

class Calculate{
	int a;
	int b;
  Calculate(int x, int y) {
  	a=x;
	b=y;
  }
	public void show(){
	System.out.printf("%d %d %.6f", a/b, a%b, (double)a/b);
}

}