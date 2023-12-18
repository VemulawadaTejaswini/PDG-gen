import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        String s=sc.next();
        boolean ans=true;
        String reg=Pattern.quote("...");
        if(s.substring(Math.min(a-1,b-1),Math.max(c,d)).replaceAll("##", "").length()!=s.substring(Math.min(a-1,b-1),Math.max(c,d)).length())ans=false;
        if(a>b&&c<d||a<b&&c>d){
            if(s.substring(Math.max(a-2,b-2),Math.min(c+1,d+1)).replaceAll(reg,"").length()==s.substring(Math.max(a-2,b-2),Math.min(c+1,d+1)).length())ans=false;
        }
        System.out.println(ans?"Yes":"No");
    }
}