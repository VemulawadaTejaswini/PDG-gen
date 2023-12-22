import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];
        int q1=0;
        int q2=0;
        int q3=0;
        
        for(int i=0; i<n; i++){
        	p[i] = sc.nextInt();
        	if(p[i] <= a){
        		q1++;
        	}else if(p[i] > a && p[i] <= b){
        		q2++;
        	}else{
        		q3++;
        	}
        }

        int min=q1;
        if(q2<=min){
        	min =q2;
        }
        if(q3<=min){
        	min =q3;
        }
        System.out.println(min);
 
    }
}
