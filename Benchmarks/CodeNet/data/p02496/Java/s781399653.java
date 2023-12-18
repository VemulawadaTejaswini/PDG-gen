import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i, k;
	String str = new String();
	int[][] ini = new int[4][13];
	i = sc.nextInt();
	for(int j=0; j<2*i-1; j=j+2){
	    str = sc.next();
	    k = sc.nextInt();
	    if(str.equals("S"))
		ini[0][k-1] = 1;
	    else if(str.equals("H"))
		ini[1][k-1] = 1;
	    else if(str.equals("C"))
		ini[2][k-1] = 1;
	    else if(str.equals("D"))
		ini[3][k-1] = 1;
	    else{
		System.out.println("Input Error!");
		break;
	    }
	}
	for(int x=0; x<4; x++)
	    for(int y=0; y<13; y++)
		if(ini[x][y]==0)
		    if(x==0)
			System.out.println("S "+(y+1));
		    else if(x==1)
			System.out.println("H "+(y+1));
		    else if(x==2)
			System.out.println("C "+(y+1));
		    else
			System.out.println("D "+(y+1));
		}
}