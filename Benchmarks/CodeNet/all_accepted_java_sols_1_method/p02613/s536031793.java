import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int wa=0,ac=0,tle=0,re=0;
        for (int i = 0; i < n; i++) {
            String s=in.nextLine();
            if(s.charAt(0)=='W'){
                wa++;
            }else if(s.charAt(0)=='A'){
                ac++;
            }else if(s.charAt(0)=='T'){
                tle++;
            }else{
                re++;
            }
        }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
    }
}