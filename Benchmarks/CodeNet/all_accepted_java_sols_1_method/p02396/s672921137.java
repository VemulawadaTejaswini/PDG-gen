import java.util.Scanner;

class Main{
    public static void main(String[] a){
    	int c, no=0;
    	Scanner in = new Scanner(System.in);
      while (true){
      	c = in.nextInt();
      	if(c == 0) break;
      	no++;
        System.out.println("Case " + no + ": " + c);
      }
    }
}