import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int    x = in.nextInt();
       int    y = in.nextInt();
       int    z = in.nextInt();
       int    w;
       
       if(x>y){
	w = x;
        x = y;
        y = w;
	}

	if(x>z){
	w = x;
	x = z;
	z = w;
	}

	if(y>z){
	w = y;
	y = z;
	z = w;
	}



       System.out.println(x + " " + y + " " + z);
   }
}