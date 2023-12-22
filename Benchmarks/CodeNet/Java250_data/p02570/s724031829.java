import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int t=1;//sc.nextInt();
		while(t-->0) {
			int d=sc.nextInt();
			int time=sc.nextInt();
			int s=sc.nextInt();
			if(s*time>=d) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}
}
class Solution {
    public int maxEnvelopes(int[][] envel) {
        int n=envel.length;
        if(n==0) return 0;
        env[] arr=new env[n];
        for(int i=0;i<n;i++){
            arr[i]=new env(envel[i][0],envel[i][1]);
        }
        //[[4,5],[4,6],[6,7],[2,3],[1,1]]
        Arrays.sort(arr);
        int[] dp=new int[n];
        int size=0;
        for(int i=0;i<n;i++){
            int left = 0, right = size, middle = 0;     // right = size
            while(left < right) {
                middle = left + (right - left) / 2;
                if(dp[middle] < arr[i].w) left = middle + 1;
                else right = middle;
            }
            
            // left is the right position to 'replace' in dp array
            dp[left] = arr[i].w;
            if(left == size) size++;
        }
        return size;
    }
}
class env implements Comparable<env>{
    int l,w;
    env(int l,int w){
        this.l=l;this.w=w;
    }
    public int compareTo(env other){
        if(this.l!=other.l) return Integer.compare(this.l,other.l);
        return Integer.compare(other.w,this.w);
    }
}
