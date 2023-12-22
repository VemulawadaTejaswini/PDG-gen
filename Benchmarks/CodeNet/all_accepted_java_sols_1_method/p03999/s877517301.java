
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        long ans=0;

        for(int i=0;i<Math.pow(2,s.length()-1);i++){
            int shift =i;
            int n=0;
            boolean[] bit = new boolean[s.length()];
            for(int j=0;j<s.length();j++){
                bit[j]=shift%2==1;
                shift = shift>>1;
                if(bit[j])n++;
            }

            int nk=0;
            for(int j=0;j<n+1;j++){

                String temp = "";
                for(int k=nk;k<s.length();k++){
                    temp += s.charAt(k);
                    if(bit[k]){
                        nk=k+1;
                        break;
                    }
                }

                ans+=Long.parseLong(temp);
                //System.out.println(Integer.parseInt(temp));

            }
        }

        System.out.println(ans);
    }
}
