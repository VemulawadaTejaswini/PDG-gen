import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] s = a.toCharArray();
        char[] t = b.toCharArray();
        char[] s2 =a.toCharArray();
        int cnt = 0;
        int cnt2 =0;
        //System.out.println(a.length());

        while(cnt<a.length()){
            for(int i =0;i<a.length();i++){
                if(i==a.length()-1){
                    s2[0]=s[i];
                }else{
                    s2[i+1]=s[i];
                }

            }
            //System.out.println(s2);
            if(Arrays.equals(t,s2)){
                cnt2++;
            }
            s=s2.clone();
            cnt++;
        }

        if(cnt2>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
