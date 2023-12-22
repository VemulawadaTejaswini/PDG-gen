import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int tb = 0;
      	int xb = 0;
      	int yb = 0;
      	int ta = 0;
      	int xa = 0;
      	int ya = 0;
      	int dt = 0;  
      	int dxy = 0;
      
     	for(int i = 0 ; i < n ; i ++){
      		ta =  sc.nextInt();
			xa =  sc.nextInt();
         	ya =  sc.nextInt();
          
			dt = ta - tb;
          	dxy = Math.abs(xa - xb) + Math.abs(ya - yb);
          	
          	if((dt < dxy) || ((dxy - dt )%2 != 0 )){
            	System.out.println("No");
            	return;
            }
          	tb = ta;
          	xb = xa;
          	yb = ya;
        }
      System.out.println("Yes");
   	}
}
