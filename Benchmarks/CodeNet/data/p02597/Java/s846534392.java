
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String s=br.readLine().trim();
        System.out.println(algo(s,n));
    }




    public static int algo(String s,int n){
        int i=-1;
        int j=n;
//        int n=s.length();
        int cnt=0;

        while(i<j){
            do{
                i++;
            }while (i<n && s.charAt(i)=='R');
            do{
                j--;
            }while (j>=0 && s.charAt(j)=='W');

            if(i>=j){
                return cnt;
            }
            cnt++;
        }
        return cnt;
    }







}
