import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext())
	    System.out.println((int)Math.log10(sc.nextInt()+sc.nextInt())+1);
    }
}