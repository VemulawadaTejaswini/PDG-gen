import java.util.*;
class Main{
	public static void main(String[] args){
	    Scanner x=new Scanner(System.in);
	    int s = x.nextInt();
		int[] r=new int[s];
		for(int i=0;i<s;i++){
		    r[i]=x.nextInt();
		}
		int Max=r[1]-r[0];
		int Min=Math.min(r[1],r[0]);
		for(int i=2;i<s;i++){
				Max = Math.max(Max,r[i]-Min);
				Min = Math.min(Min,r[i]);
			}
		System.out.println(Max);
	}
}
