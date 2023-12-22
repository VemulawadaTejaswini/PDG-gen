import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam = sc.nextInt();
      	int yen = sc.nextInt();
      
      int r10000 = -1; int r5000 = -1; int r1000 = -1;
      		
 		for(int a = 0;a <= nam ;a++){
          	for(int b = 0;a+b <= nam ; b++){
              int	c = nam-a-b;
              	int sum = a*10000 + b*5000 + c*1000;
              	if(sum == yen){
                	r10000 = a;
                  	r5000  = b;
                  	r1000  = c;
                  System.out.print(r10000 +" "+r5000+" "+r1000);
                  System.exit(0); 
                }
            }
        }
      System.out.print(r10000 +" "+r5000+" "+r1000);
    }
}