import java.io.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in),1024);
        int n=Integer.parseInt(bf.readLine());
        ArrayList<String> ans=new ArrayList<String>();
        
        for(int i=n;0<i;i--){
            String[] str=bf.readLine().split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
            int z=Integer.parseInt(str[2]);
            
            int k=x*x+y*y;
            int j=z*z;
            
            
            if(k!=j)
                ans.add("NO");
            else if(k==0 || j==0)
                ans.add("NO");
            else
                ans.add("NO");
        }
                for(int i=0;i<ans.size();i++){
                    String a=ans.get(i);
                    System.out.println(a);
                }
    }
}