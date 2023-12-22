import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next(),T=sc.next();
        long res=S.length();
        for(int i=0;i<=S.length()-T.length();i++){
            long count=0;
            for(int j=0;j<T.length();j++){
                if(S.charAt(i+j)!=T.charAt(j)){
                    count++;
                }
            }
            res=Math.min(res,count);
        }
        System.out.println(res);
    }
}