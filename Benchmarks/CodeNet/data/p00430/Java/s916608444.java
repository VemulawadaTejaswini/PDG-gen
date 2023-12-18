import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[50];
	int i=0, ix=0;

	while(true){
	    a[i] = sc.nextInt();
	    if(a[i] == 0)
		break;
	    i++;
	}

	for(int cr=0; a[cr]!=0; cr++){
	    int x=0, p=0;
	    int[] b = new int[500];
	    System.out.println(a[cr]);
	    b[0]=a[cr];
	    while(true){
		if(p==a[cr]-1)
		    break;
		if(b[x+1]<b[x]-1){
		    b[x]-=1;
		    b[x+1]+=1;
		    if(b[x+1]==1)
			p++;
		    for(int ce=0; ce<p+1; ce++)
			System.out.print(b[ce]+" ");
		    System.out.println();
		    x=0;
		}
		else if(b[x+1] == 1){
		    b[x]=1;
		    b[p+1]=1;
		    p++;
		    for(int ce=0; ce<p+1; ce++)
			System.out.print(b[ce]+" ");
		    System.out.println();
		    x=0;
		}
		else
		    x++;
	    }
	}
    }
}