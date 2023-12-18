import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n ==0) break;
			int count = 0;
			for(int i=1; i<=n/2; i++){
				if(dfs(i, 0, n)) count++;
			}
			System.out.println(count);
		}
	}
	public static boolean dfs(int val, int sum, int n){
		if(sum>n) return false;
		else if(sum==n || dfs(val+1, sum+val, n)) return true;
		return false;
	}
}