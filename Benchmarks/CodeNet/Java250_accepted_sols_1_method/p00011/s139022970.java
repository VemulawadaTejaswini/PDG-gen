import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int l=Integer.parseInt(s.nextLine())+1;
		int x=Integer.parseInt(s.nextLine());
		int[] p = new int[l];
		for(int i=0;i<l;i++)p[i]=i;
		while(x-->0){String str=s.nextLine();int a= Integer.parseInt(str.split(",")[0]);int b= Integer.parseInt(str.split(",")[1]);int t=p[a];p[a]=p[b];p[b]=t;}
		for(int i=1;i<l;i++)System.out.println(p[i]);
	}
}