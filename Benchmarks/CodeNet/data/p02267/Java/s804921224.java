import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(bf.readLine());
        String[] sp1 = bf.readLine().split(" ");
        int n2 = Integer.parseInt(bf.readLine());
        String[] sp2 = bf.readLine().split(" ");
        int sum=0;
        for (int i=0;i<n1;i++){
            for (int j=0 ;j<n2;j++){
                if (sp1[i].equals(sp2[j]))sum++;
            }
        }
        System.out.println(sum);
    }
}
