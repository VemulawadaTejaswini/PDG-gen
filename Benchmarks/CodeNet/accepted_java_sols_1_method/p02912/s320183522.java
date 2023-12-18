/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		StringTokenizer str = new StringTokenizer(in.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue(n, Collections.reverseOrder());
		while(str.hasMoreTokens()) {
		    queue.offer(Integer.parseInt(str.nextToken()));
		}
		
		while(m>0){
		    int current_max = queue.poll();
		    m--;
		    queue.offer(current_max/2);
		}
		
		long sum = 0;
		while(!queue.isEmpty()){
		    sum += (long)queue.poll();
		}
		System.out.println(sum);
	}
		
}
