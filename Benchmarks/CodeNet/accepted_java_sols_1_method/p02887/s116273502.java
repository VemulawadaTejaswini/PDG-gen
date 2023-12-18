import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str  = sc.nextLine();
        String[] astr = str.split(""); //状況に合わせて
        sc.close();

        //Arrays.sort(astr);
        int ans = 1;
        String flag = astr[0];
        for(int i=1;i<astr.length;i++){
            if(!flag.equals(astr[i])){
                ans+=1;
                flag = astr[i];
            }
        }
        System.out.println(ans);
    }
}