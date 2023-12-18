import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    // A:直角, B:鋭角, C:鈍角
    int triA, triB, triC; 
    int[] l;
    int i;
    boolean ex;

    void run(){
	ex = true;
	triA = triB = triC = 0;
	while(sc.hasNext()){
	    l = new int[3];
	    for(i=0; i<3; i++)
		l[i] = sc.nextInt();
	    Arrays.sort(l);
	    if(ex)solve();	    
	}
	int sum = triA + triB + triC;
	System.out.println(sum+" "+triA+" "+triB+" "+triC);	  
    }

    void solve(){
	if(l[2]-l[1] < l[0] && l[0] < l[2]+l[1]){	
	    int s = l[0]*l[0] + l[1]*l[1];
	    int t = l[2]*l[2];
	    //System.out.println(s+" "+t);
	    if(s==t)
		triA++;
	    else if(s>t)
		triB++;
	    else if(s<t)
		triC++;
	}
	else 
	    ex = false;
    }
}