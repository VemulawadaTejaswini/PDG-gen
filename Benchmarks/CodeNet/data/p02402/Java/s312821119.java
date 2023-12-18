import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int max=0;
        int min=0;
        int sum=0;
        String[] lines=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(lines[i]);
            sum+=a;
            if(i==0){
                max=a;
                min=a;
            }else{
                if(a>max){
                    max=a;
                }
                if(a<min){
                    min=a;
                }
            }
        }
        System.out.println(min+" "+max+" "+sum);
    }
}