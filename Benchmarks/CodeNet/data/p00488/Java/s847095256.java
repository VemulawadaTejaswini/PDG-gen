import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int x=sc.nextInt(), y, z;
	y = Math.min(sc.nextInt(), sc.nextInt());
	z = Math.min(sc.nextInt(), sc.nextInt());
	System.out.println(Math.min(x,y)+z-50);
    }
}