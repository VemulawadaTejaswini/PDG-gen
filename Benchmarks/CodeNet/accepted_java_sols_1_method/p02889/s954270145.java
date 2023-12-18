import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    
    static final int MAX = (int)1e9+1;
    
    /*
    이문제는 도시를 여행하는데,
    도시를 여행할때마다 L이라는 연료가 소모되고 각 도시를 지나갈때마다 연료를 충전할 수 있다.
    우리가 찾고자 하는것은 최소한의 연료충전으로 도시를 까지 여행할 수 있는 충전 횟수를 구하는것이 목표이다.
    Q로 여러개의 질답이 나오기 때문에 미리 행렬에 최단거리 ( L을 거리로 친다.)를 기록하는것이 더 유리하다.
    
    */
    public static int[][] maps=new int[301][301];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m,l,a,b,c,q,s,t;
        n=sc.nextInt();
        m=sc.nextInt();
        l=sc.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		maps[i][j]=MAX;
        	}
        }
        for(int i=0;i<n;i++) {
        	maps[i][i]=0;
        }
        for(int i=0;i<m;i++) {
        	a=sc.nextInt()-1;
        	b=sc.nextInt()-1;
        	c=sc.nextInt();
        	maps[a][b]=c;
        	maps[b][a]=c;
        }
        
        //첫번째 floyd
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		for(int k=0;k<n;k++) {
        			int sum=maps[j][i]+maps[i][k];
        			maps[j][k]=Math.min(sum, maps[j][k]);
        		}
        	}
        }
        
        //걸러낸다 !
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(maps[i][j]<=l)
        			maps[i][j]=1;
        		else
        			maps[i][j]=MAX;
        	}
        }
        
        //다시한번 floyd
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		for(int k=0;k<n;k++) {
        			int sum=maps[j][i]+maps[i][k];
        			maps[j][k]=Math.min(sum, maps[j][k]);
        		}
        	}
        }
        
        
        q=sc.nextInt();
        for(int i=0;i<q;i++) {
        	s=sc.nextInt()-1;
        	t=sc.nextInt()-1;
        	int ans=maps[s][t];
        	if(ans==MAX)
        		System.out.println(-1);
        	else
        		System.out.println(ans-1);
        }
        
    }
}
