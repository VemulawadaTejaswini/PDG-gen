import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] dislike = new boolean[10];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<K; i++){
            int d = Integer.parseInt(st.nextToken());
            dislike[d]=true;
        }

        int ans = 0;
        String n = Integer.toString(N);
        boolean inc=false;
        boolean raised=false;
        for(int i=0; i<n.length(); i++){
            int cur = n.charAt(i)-'0';
            int k=cur;
            if(raised)
                k=0;
            while(k<10){
                if(!dislike[k]){
                    ans=ans*10+k;
                    break;
                }
                k++;
            }
            if(k!=cur)
                raised=true;
            if(k==10){
                inc=true;
                k=0;
                while(k<10){
                    if(!dislike[k]){
                        ans=ans*10+k;
                        break;
                    }
                    k++;
                }
            }
        }
        if(inc){
            int k=0;
            while(k<10){
                if(!dislike[k]){
                    ans=ans*10+k;
                    break;
                }
                k++;
            }
        }
        System.out.println(ans);

    }
}