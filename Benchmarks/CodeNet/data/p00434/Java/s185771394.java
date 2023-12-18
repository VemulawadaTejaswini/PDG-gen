import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i;
	int[] ini = new int[30];
	
	for(i=0; i<30; i++)
	    ini[i] = sc.nextInt();
	for(i=0; i<30; i++)
	    if(ini[i]==0)
		System.out.println(i);
    }
}