import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] blue=new String[n];
        for(int i=0;i<n;i++)blue[i]=sc.next();
        int m=sc.nextInt();
        String[] red=new String[m];
        for(int i=0;i<m;i++)red[i]=sc.next();
        int[] tmp=new int[2];
        boolean[] visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            tmp[0]=tmp[1]=0;
            for(int j=0;j<n;j++){
                if(blue[i].equals(blue[j])&&!visited[j]){
                    tmp[0]++;
                    visited[j]=true;
                }
            }
            for(int j=0;j<m;j++){
                if(blue[i].equals(red[j]))tmp[1]++;
            }
            ans=Math.max(ans, tmp[0]-tmp[1]);
                    
        }
        System.out.println(ans);
    }

}
