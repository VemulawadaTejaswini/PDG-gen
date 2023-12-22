import java.util.*;

class Main{
	public static void main(String[] args){
      	int k, p;
      	double answer = 0, n;
    	Scanner sc = new Scanner(System.in);
      	n = sc.nextDouble();
      	k = sc.nextInt();
      	
      	for(int i = 1; i <= n; i++) {
      		int count = 0;
      		p = i;
      		while(true) {
      			if(p >= k) {
      				answer = answer + ((1.0/n) * Math.pow(0.5, count));
      				break;
      			}
      			count++;
      			p = p*2;
      		}
      	}
      	System.out.println(answer);
    }
}