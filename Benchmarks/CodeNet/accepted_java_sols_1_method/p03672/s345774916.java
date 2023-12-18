import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        int n=S.length();
        for(int i=n-2;true;i-=2){
            String v=S.substring(0,i/2),u=S.substring(i/2,i);
            if(v.equals(u)){
                System.out.println(i);
                break;
            }
        }
    }
}