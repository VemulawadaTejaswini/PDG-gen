import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),x,y;
        int n = sc.nextInt(),a,b;
        for(int i=0;i<n;i++){
            x=sc.next();a=sc.nextInt();b=sc.nextInt();
            if(x.equals("print"))System.out.println(s.substring(a,b+1));
            else if(x.equals("replace")){
                y=sc.next();s=s.substring(0,a)+y+s.substring(b+1);
            }
            else {
                 y = s.substring(a,b+1);char[] lst=new char[y.length()];
                for(int j=0;j<y.length();j++){
                    lst[j]=y.charAt(y.length()-j-1);
                }
                s=s.substring(0,a)+s.valueOf(lst)+s.substring(b+1);
            }
        }
    }
}
