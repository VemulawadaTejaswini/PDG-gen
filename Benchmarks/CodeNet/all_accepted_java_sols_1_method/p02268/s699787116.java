import java.io.*;
import java.util.*;

class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws IOException{
                int n1 = Integer.parseInt(br.readLine());
                int[] a1 = new int[n1];
                String[] s1 = br.readLine().split(" ");
                for(int i=0; i<n1; i++)
                        a1[i] =  Integer.parseInt(s1[i]);
                int n2 = Integer.parseInt(br.readLine());
                int[] a2 = new int[n2];
                String[] s2 = br.readLine().split(" ");
                for(int i=0; i<n2; i++)
                        a2[i] = Integer.parseInt(s2[i]);

                int ans = 0;
                for(int i: a2){
                        int l = 0;
                        int r = n1-1;
                        int m = (r-l)/2;
                        for(int j=0; j<a1.length; j++){
                                if(a1[m] == i){
                                        ans++;
                                        break;
                                }
                                if(a1[m]>i)
                                        r=m;
                                else
                                        l=m;
                                if(r==l)
                                        break;
                                m=r-(r-l)/2;
                        }
                }
                System.out.println(ans);
        }
}