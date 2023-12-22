import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	ArrayList<Integer> array = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int i=0, j, k, l, m;
	
	while(true){
	    array.add(sc.nextInt());
	    if(i%2==1)
		if(array.get(i)==0 && array.get(i-1)==0)
		    break;
	    i++;
	}
	
	for(j=0; j<i-1; j=j+2){
	    for(k=0; k<array.get(j); k++){
		if(k==0 || k==array.get(j)-1)
		    for(l=0; l<array.get(j+1); l++)
			System.out.print("#");
		else
		    for(l=0; l<array.get(j+1); l++){
			if(l==0 || l==array.get(j+1)-1)
			    System.out.print("#");
			else
			    System.out.print(".");
		    }
		System.out.println();
	    }
	    System.out.println();
	}
    }
}