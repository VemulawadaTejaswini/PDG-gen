import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] in = new String[N];
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for(int i=0;i<N;i++){
            in[i] = scan.next();
            if(in[i].equals("AC")){
                ac+=1;
            }else if(in[i].equals("WA")){
                wa+=1;
            }else if(in[i].equals("TLE")){
                tle+=1;
            }else if(in[i].equals("RE")){
                re+=1;
            }
        }

        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);

    }
}