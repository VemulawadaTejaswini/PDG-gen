import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        String S=sc.next();
        int r=0;
        for(int i=0;i<3;i++){
            if(S.charAt(i)=='R') r++;
        }
        System.out.println(r);
    }
}
