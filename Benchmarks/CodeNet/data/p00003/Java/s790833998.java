import java.io.*;
import java.util.*;
public class???Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        ArrayList<String> ans=new ArrayList<String>();
        int[] num={};
        for(int i=0;i<n;i++){
            String[] str=bf.readLine().split(" ");
            
            for(int j=0;j<3;j++){
                num[j]=Integer.parseInt(str[j]);
            }
            
            Arrays.sort(num);       
            
            
            if(num[2]*num[2]==(num[1]*num[1])+(num[3]*num[3]))
                ans.add("NO\n");
            else 
                ans.add("YES\n");
        }
                    System.out.println(ans);
    }
}