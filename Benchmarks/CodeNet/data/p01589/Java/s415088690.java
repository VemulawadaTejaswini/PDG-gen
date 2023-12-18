import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i, n = sc.nextInt();
	int[] map = new int[n];
	for(i=0; i<n; i++)
	    map[i] = sc.nextInt();
	Arrays.sort(map);
	long sum = map[0];
	for(i=1; i<=n; i++){
	    if(i==n||map[i]>sum+1){
		System.out.println(sum+1);
		break;
	    }
		sum += map[i];
	}
	
    }
}