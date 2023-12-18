import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		char arr[] = s.toCharArray();
		int wcount=0;
		int count=0;
		for(int i=0;i<N;i++){
		    if(arr[i]=='W'){
		        wcount++;
		    }
		}
		for(int i=N-wcount;i<N;i++){
		    if(arr[i]=='R'){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
