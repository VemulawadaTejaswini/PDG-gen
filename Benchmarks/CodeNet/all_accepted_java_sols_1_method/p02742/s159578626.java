import java.util.*;
 
class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
      	long h = sc.nextLong();
      	long z = m * h;
      	long N = z / 2;
     	if(z % 2 != 0){
         	N += 1; 
        }
        if(m == 1 || h == 1){
N = 1;
       }
        System.out.println(N);
	}
 
}