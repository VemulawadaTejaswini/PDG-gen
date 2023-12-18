public class Main {
    public static void main(String[] args){
        long n=new java.util.Scanner(System.in).nextLong();
        String ans="";
        String alp="abcdefghijklmnopqrstuvwxyz";
        for(;;){
            long x=(int)Math.floor(n/26);
            if(n%26==0)x=n/26-1;
            long y=n-x*26;
            n=x;
            ans=alp.charAt(y-1)+ans;
            if(n==0)break;
        }
        System.out.println(ans);
    }
}