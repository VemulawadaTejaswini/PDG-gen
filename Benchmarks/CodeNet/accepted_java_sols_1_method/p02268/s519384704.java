import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
	int r,l,m,n,q,i,j,count=0;
	int s[] = new int[1000000];
	int t[] = new int[1000000];
	Scanner scan = new Scanner(System.in);
	
	n = scan.nextInt();
	for(i=0;i<n;i++){
	    s[i] = scan.nextInt();
	}
	q = scan.nextInt();
	for(j=0;j<q;j++){
	    t[j] = scan.nextInt();
	}
	
	for(j=0;j<q;j++){
	    r = n;
	    l = 0;
	    m = n/2;
	    while(true){
		if(s[m]==t[j]){count++;break;}
		if(m==l){break;} 
		if(s[m]>t[j]){/*探す値が左側にあった場合*/
		    r = m;
		    m = (r+l)/2;
		}
		if(s[m]<t[j]){/*探す値が右側にあった場合*/
		    l = m+1;
		    m = (r+l)/2;
		}
		}
	}
	System.out.println(count);
    }
}

