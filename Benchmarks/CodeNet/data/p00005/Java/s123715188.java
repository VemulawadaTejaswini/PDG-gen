import java.util.*;
import java.io.*;
class Main{
    int gcd(int p, int q){
	return q==0?p:gcd(q,p%q);
    }

    void ruun(){
	Scanner sc = new Scanner(System.in);
	int x, y, z;
	while(sc.hasNext()){
	    x = sc.nextInt();
	    y= sc.nextInt();
	    z = gcd(Math.max(x,y), Math.min(x,y));
	    System.out.println(z+" "+x/z*y);
	}
    }

    public static void main(String[] args){
	new Main().ruun();
    }
}