import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static int moves;
	static int min;
	static List<Integer> list_1 =new ArrayList<Integer>();
	static List<Integer> list_2 =new ArrayList<Integer>();
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int M[][]=new int[N][N];
		for(int b=0;b<N*N;b++) {
			list_1.add(sc.nextInt());
			int x=b/N;
			int y=b%N;
			M[x][y]=1;
		}
		for(int a=0;a<N;a++) {
			M[0][a]=0;
			M[a][0]=0;
			M[0][N]=0;
			M[N][0]=0;
		}
		for (int b=0;b<N*N;b++) {
			int z=list_1.get(b);
			int x=b/N;
			int y=b%N;
			habayuusenn(x,y);
			min=min+Collections.min(list_2);
		}
		System.out.println(min);
		}
	static void habayuusenn(int x,int y) {
		if(M[x][y]==-1) {
			list_2.add(moves);
		}
		else {
			moves++;
			habayuusenn(x+1,y);
			habayuusenn(x,y+1);
			habayuusenn(x,y-1);
			habayuusenn(x-1,y);
		}
	}
	public static int M[][]=new int [N][N];
	}
