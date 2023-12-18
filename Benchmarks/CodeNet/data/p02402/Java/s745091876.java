import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n,min,max,sum;
        int m = sc.nextInt();
        sum = m;
        min = m;
        max = m;
        
        for(int i=1;i<N;i++){
        	n = sc.nextInt();
        	sum += n;
        	if(max<n){max = n;}
        	if(min>n){min = n;}
        }
        System.out.println(min+" "+max+" "+sum);

    }
}