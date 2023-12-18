import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==52) return;
        boolean a[] = new boolean[52];
        String str[] = new String[2];
        for(int i=n;i>0;i--){
            str = br.readLine().split(" ");
            switch(str[0]){
                case "S":
                    a[Integer.parseInt(str[1])-1] = true;
                    break;
                case "H":
                    a[Integer.parseInt(str[1])-1+13] = true;
                    break;
                case "C":
                    a[Integer.parseInt(str[1])-1+26] = true;
                    break;
                case "D":
                    a[Integer.parseInt(str[1])-1+39] = true;
                    break;
                default:
                    break;
            }
        }
        for(int i=0;i<52;i++){
            if(a[i]==false){
                if(i<13) System.out.println("S "+(i+1));
                else if(i<26) System.out.println("H "+(i+1-13));
                else if(i<39) System.out.println("C "+(i+1-26));
                else  System.out.println("D "+(i+1-39));
            }
        }
    }
}