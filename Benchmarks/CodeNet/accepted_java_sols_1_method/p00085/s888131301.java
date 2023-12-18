import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int n = scan.nextInt();
        	int m = scan.nextInt();
        	if(n == 0 && m == 0){
        		break;
        	}
        	boolean[] p = new boolean[n];
        	int i = 0;
        	int ii = 1;
        	int nn = n;
        	while(nn > 1){
        		if(i > n-1){
        			i %= n;
        		}
        		if(p[i]){
        			i++;
        			continue;
        		}
        		if(ii == m){
        			p[i] = true;
        			ii = 0;
        			nn--;
        		}
        		ii++;
        		i++;
           	}
        	for(int j = 0;j < n;j++){
        		if(!p[j]){
        			System.out.println(j+1);
        		}
        	}
        }
    }
}