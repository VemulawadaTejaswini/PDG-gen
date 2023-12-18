import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] min = new int [n];
        int [] max = new int [n];
        for(int i=0;i<n;i++){min[i] = sc.nextInt();
                             max[i] = sc.nextInt();
                            }
	    Arrays.sort(min);
        Arrays.sort(max);
        if(n%2==0){System.out.println(max[n/2-1]+max[n/2]-min[n/2-1]-min[n/2]+1);}
        else{System.out.println(max[n/2]-min[n/2]+1);}
	}
}
