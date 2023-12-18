import java.util.*;
public class Main {
 
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
    	Arrays.sort(a);
    	String Op="";
    	Op+=a[0];
    	for(int i=1;i<n;i++)Op=Op+" "+a[i];
        System.out.println(Op);
    }
}
//by TTTMongolia 11/05/2012