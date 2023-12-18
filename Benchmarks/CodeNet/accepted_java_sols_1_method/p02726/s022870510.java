import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        int y=sc.nextInt();
        int dist[] = new int[n];
        //int maxLength = 1 + (x-1) + (n-x);
        //int total = n*(n-1)/2 ;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                 int minDistance = Math.min(Math.abs(j-i),Math.abs(x-i)+1+Math.abs(y-j));
                 dist[minDistance]++;
            }
        }
        for(int i=1;i<n;i++)
            System.out.println(dist[i]);
        
    }
}