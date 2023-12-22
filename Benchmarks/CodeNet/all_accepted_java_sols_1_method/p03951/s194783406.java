import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt();
        String s=sc.next(),t=sc.next();
        for(int i=0;i<=N;i++){
            String S=s.substring(i),T=t.substring(0,N-i);
            if(S.equals(T)){
                sb.append(s.substring(0,i));
                sb.append(t);
                break;
            }
        }
        int res=sb.toString().length();
        System.out.println(res);
    }
}
