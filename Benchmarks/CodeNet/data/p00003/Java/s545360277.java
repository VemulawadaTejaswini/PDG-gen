import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanf =new Scanner (System.in);

		int N =scanf.nextInt();
		int i,x,y;
		int a[]=new int [N],b[]=new int [N],c[]=new int [N];
	
		for (i=0; i<N; i++){
		a[i]=scanf.nextInt();b[i]=scanf.nextInt();c[i]=scanf.nextInt();
		if (a[i]>b[i]) {x=a[i]; a[i]=b[i]; b[i]=x;}
		if (b[i]>c[i]) {x=b[i]; b[i]=c[i]; c[i]=x;}}
		
		for (i=0; i<N; i++){
		if (a[i]*a[i]+b[i]*b[i]==c[i]*c[i]) 
		System.out.println("YES");
		else
		System.out.println("NO");}

		
	}
}