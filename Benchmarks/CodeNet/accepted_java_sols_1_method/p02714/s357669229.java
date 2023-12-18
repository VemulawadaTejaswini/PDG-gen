/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String c=s.next();
	HashSet<Integer> cl=new HashSet<>();
	ArrayList<Integer> bl=new ArrayList<>();
	ArrayList<Integer> al=new ArrayList<>();
	for(int i=0;i<n;i++)
	{char cc=c.charAt(i);
	if(cc=='R')
	al.add(i);
	else if(cc=='G')
	bl.add(i);
	else
	cl.add(i);
	}
	long ans=0;
	for(int i=0;i<al.size();i++)
	{for(int j=0;j<bl.size();j++)
	{int p=al.get(i);
	int q=bl.get(j);
	int k=Math.abs(p-q);
	int max=Math.max(p,q);
	int min=Math.min(p,q);
	ans+=cl.size();
	if(cl.contains(max+k))
	ans-=1;
	if((k)%2==0 && cl.contains(max-k/2))
	ans-=1;
	if(cl.contains(min-k))
	ans-=1;
	}}
	System.out.println(ans);
	}
}