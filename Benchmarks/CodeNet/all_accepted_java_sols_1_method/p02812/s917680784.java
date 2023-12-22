import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		char S[] = sc.next().toCharArray();
		int count = 0;
		
		int t=0;
		int ssss=0;
	    int data[] =new int[3];
		for(int i=0;i<N;i++) {
			       if(i<N-2) {
			           if(S[i]=='A' && S[i+1]=='B' && S[i+2]=='C'){
			           count++;
			          }
			       }
			    }
		System.out.println(count);

			}
		
		
		
	}