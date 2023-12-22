import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] r=new int[n];
	
	for(int i=1;i<=n;i++)r[sc.nextInt()-1]=i;
	for(int rr:r)System.out.print(rr+" ");
 }
}