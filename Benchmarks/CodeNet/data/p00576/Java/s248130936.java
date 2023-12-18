import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] x = new int[2020];
	int[] empty = new int[2021];
	for(int i=1;i<2021;i++) empty[i]=0;
	for(int i=0;i<n;i++){
		x[i+1]=sc.nextInt();
		empty[x[i+1]]=1;
	}
	int m = sc.nextInt();
	int a;
	for(int i=0;i<m;i++){
		a=sc.nextInt();
		if(empty[x[a]+1]==0&&x[a]!=2019){
			empty[x[a]+1]=1;
			empty[x[a]]=0;
			x[a]++;
		}
	}
	for(int i=0;i<n;i++){
		System.out.println(x[i+1]);
	}

    }
}

