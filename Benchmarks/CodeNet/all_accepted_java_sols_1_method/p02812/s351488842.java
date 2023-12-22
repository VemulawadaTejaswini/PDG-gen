import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String abc="ABC";
        int ans=0;
        boolean flag;
        for(int i=0;i<n-2;i++){
            flag=true;
            for(int j=0;j<3;j++){
                if(s.charAt(i+j)!=abc.charAt(j))flag=false;
                
            }
            if(flag)ans++;
        }
        System.out.println(ans);

    }



}