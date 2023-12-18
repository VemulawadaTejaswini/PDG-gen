import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
     
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
 
		int[] x = new int[n];
		int i;
		for(i=0; i<n; i++){
		    x[i] = kbd.nextInt();
		}
 
		sort(x);
 
		for(i=0; i<n; i++){
		    System.out.print(x[i]);
		    if(i+1<n) System.out.print(" ");
		}
		System.out.println();
	    }
	}
    }
 
    public static void sort(int[] x){
	int min, i, j, w;
	for(i=0; i<x.length; i++){
	    min = i;
	    for(j=i; j<x.length; j++){
		if(x[j] < x[min]) min=j;
	    }
	    w = x[i];
	    x[i] = x[min];
	    x[min] = w;
	}
    }
}