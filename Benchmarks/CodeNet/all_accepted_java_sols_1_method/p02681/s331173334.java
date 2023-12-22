import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine().trim();
        String s2=br.readLine().trim();
        int n=s2.length()-1;
        String s3=s2.substring(0,n);

        if(s3.equals(s1) && !s1.equals(s2) && (s2.length()==s1.length()+1))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }




    }

}
