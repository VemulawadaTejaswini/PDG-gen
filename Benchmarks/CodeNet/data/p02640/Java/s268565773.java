import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int animals=Integer.parseInt(st.nextToken());
        int legs=Integer.parseInt(st.nextToken());
        int sum=0;
        int c=0;
        int mask=0;
        int []l=new int[]{2,6};
        ArrayList<Integer> sums=new ArrayList<>();
        if(animals==1 && (legs==2 || legs==4))
            System.out.println("Yes");
        else{
            if(animals%legs==0)
                System.out.println("No");
            else {
                sum=(2*(legs/animals))+4;
                if(sum==legs)
                    System.out.print("Yes");
                else
                    System.out.print("No");
            }
        }
    }
}
