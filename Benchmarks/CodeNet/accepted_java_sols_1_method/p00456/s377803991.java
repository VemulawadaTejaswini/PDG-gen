import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[] ini = new int[10];
	int[] itu = new int[10];
	int a=0;
	for(int i=0; i<10; i++)
	    ini[i] = sc.nextInt();
	for(int i=0; i<10; i++)
	    itu[i] = sc.nextInt();
	
	for(int i=9; i>=1; i--)
	    for(int j=0; j<i; j++)
		if(ini[j] < ini[j+1]){
		    a = ini[j];
		    ini[j]=ini[j+1];
		    ini[j+1]=a;
		}
	System.out.print(ini[0]+ini[1]+ini[2]+" ");
	a=0;
	for(int i=9; i>=1; i--)
	    for(int j=0; j<i; j++)
		if(itu[j] < itu[j+1]){
		    a = itu[j];
		    itu[j]=itu[j+1];
		    itu[j+1]=a;
		}
	System.out.println(itu[0]+itu[1]+itu[2]);
    }
}