import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int x=sc.nextInt();
        int m[]=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        int min=100000;
        for(int i=0;i<n;i++){
            if(min>m[i]) min=m[i];
            x-=m[i];
        }
        int count=n+x/min;
        System.out.println(count);
        

    }
}
