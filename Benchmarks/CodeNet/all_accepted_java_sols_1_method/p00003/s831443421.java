import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        StringBuilder ans=new StringBuilder();


        for(int i=0;i<n;i++){
            String[] str=bf.readLine().split(" ");

            double x=Math.pow(Integer.parseInt(str[0]),2);
            double y=Math.pow(Integer.parseInt(str[1]),2);
            double z=Math.pow(Integer.parseInt(str[2]),2);


            if(x+y==z || x+z==y || y+z==x)
                ans.append("YES\n");
            else
                ans.append("NO\n");
        }
        System.out.print(ans);
    }
}