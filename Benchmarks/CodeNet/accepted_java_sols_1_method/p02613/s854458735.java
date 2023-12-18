import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ac = 0 , wa = 0 , tle = 0 , re = 0 ;
        String a = "AC";
        String w = "WA";
        String t = "TLE";
        for(int i = 1 ; i <= n ; i++ ){
            String ch = sc.next();
            if( a.equals(ch) ){
                ac++;
            }else if(w.equals(ch)){
                wa++;
            }else if(t.equals(ch)){

                tle++;
            }else{
                re++;
            }
        }
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
        sc.close();
    }
}