import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int c;//counter
      	int tri;//triplet
      	int x, y, z;
      	for (int n=1; n<=N; n++) {
          	c = 0;
        	for (int X=2; X<=(int)Math.sqrt(2*n/3); X++) {
            	for (int Y=X; Y<=(int)Math.sqrt((2*n - X*X)/2); Y++) {
                  	int Z =  (int)Math.sqrt(2*n - X*X - Y*Y);
                  	tri = X*X + Y*Y + Z*Z;
                  	x = (X + Y - Z) / 2;
                  	y = (X - Y + Z) / 2;
                  	z = (-X + Y + Z) / 2;
                  	if ((((1<=x)&&(tri == 2*n))&&(1<=y))&&(1<=z)) {
                    	if ((X==Y)&&(Y==Z)) {c++;}
                      	else if (X==Y) {c+=3;}
                      	else if (Y==Z) {c+=3;}
                      	else {c+=6;}
                    }
                }
            }
          	System.out.println(c);
        }
    }
}