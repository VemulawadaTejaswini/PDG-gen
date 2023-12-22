import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int array[] =new int[3];
            for(int j=0;j<array.length;j++) array[j]=Integer.parseInt(st.nextToken());
            Arrays.sort(array);
            if(Math.pow(array[0],2)+Math.pow(array[1],2)==Math.pow(array[2], 2))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}