import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        int sl=s.length();
        int pl=p.length();
        s=s+s.substring(0,pl-1);
        for(int i=0;i<sl;i++){
            for(int j=0;j<pl;j++){
                if(s.substring(i,i+pl).equals(p)){
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}

