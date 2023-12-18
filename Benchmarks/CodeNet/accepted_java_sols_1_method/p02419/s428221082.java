import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean end_str = false;
        String s = sc.next();
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        int l = s.length();
        int cnt = 0;
        while(true){
            String s1 = sc.next();
            if(s1.equals("END_OF_TEXT")){
                break;
            }
            s1 = s1.toUpperCase();
            s1 = s1.toLowerCase();
            //System.out.printf("%s%n",s1);
            char[] c1 = s1.toCharArray();
            
            int l1 = s1.length(),cnts=0;
            if(s1.equals(s)){
                cnt++;
            }
            /*
            for(int i=0;i<l1-l+1;i++){
                for(int j=0;j<l;j++){
                    if(c1[i+j] == c[j]){
                        cnts++;
                        //System.out.printf("%c:%d%n",c1[i+j],j);
                    }
                    else{
                        break;
                    }
                }
                if(cnts == l){
                    cnt++;
                }
                cnts = 0;
            }
            */
            
        }
        System.out.println(cnt);
        sc.close();
    }
}
