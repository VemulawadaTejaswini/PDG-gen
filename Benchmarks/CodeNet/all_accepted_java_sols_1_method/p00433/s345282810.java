import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i, j=0, k=0;

	for(i=0; i<4; i++)
	    j+=sc.nextInt();
	for(i=0; i<4; i++)
	    k+=sc.nextInt();

	System.out.println(Math.max(j, k));
    }
}