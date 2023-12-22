import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int N=s.length();
        int mid=N/2;
        boolean flag=true;
        for(int i=0;i<=mid;i++){
            if(s.charAt(i)!=s.charAt(N-1-i)){
                flag=false;
                break;
            }
        }
        int mid1=mid/2;
        for(int i=0;flag && i<=mid1;i++){
            if(s.charAt(i)!=s.charAt(mid-1-i)) flag=false;
        }
        int mid2=mid/2+mid+1;
        for(int i=mid+1;flag && i<=mid2;i++){
            if(s.charAt(i)!=s.charAt(2*mid-i)) flag=false;
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}