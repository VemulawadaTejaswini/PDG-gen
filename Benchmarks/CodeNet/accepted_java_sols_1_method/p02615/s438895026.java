import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a=new long[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextLong();
        }

        Arrays.sort(a);

        long count=a[N-1];
        int p=0;
        int q=2;
        for(int i=2; i<N; i++){
            count = count + a[N-q];
            p++;
            if(p==2){
                p=0;
                q++;
            }
        }
        
        System.out.println(count);
        
        
        
        
        
        }
    }