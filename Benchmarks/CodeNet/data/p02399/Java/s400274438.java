import java.io.*;
 import java.util.*;
public class Main{
  static public void main(String args[]){
 try {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String buf = br.readLine();

String[] tmp = buf.split(" ",0);

Calculate calc = new Calculate(Integer.parseInt(tmp[0]),
								Integer.parseInt(tmp[1]));
	calc.show();
    } catch(IOException e) {
      System.err.println(e.getMessage());
    }
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