import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n;
	int[] s;
	while(true){
	    n = sc.nextInt();
	    if(n==0)
		break;
	    s = new int[n];
	    int t = 0, alp = 0;
	    for(int i=0; i<n; i++){
		s[i] = sc.nextInt();
		t+=s[i];
	    }
	    t = t/n;
	    for(int i=0; i<n; i++)
		alp+=(s[i]-t)*(s[i]-t);
	    System.out.println(Math.sqrt(alp/n));
	}
    }
}