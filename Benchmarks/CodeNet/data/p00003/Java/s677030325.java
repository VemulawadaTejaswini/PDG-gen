import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        
        
        for(int i=0;i<n;i++){
            String[] str=bf.readLine().split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
            int z=Integer.parseInt(str[2]);
            
            int ans=(x*x)+(y*y);
            int j=z*z;
            
            if(ans==j)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}