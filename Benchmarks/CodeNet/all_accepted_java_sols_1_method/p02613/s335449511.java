import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntAC=0;
        int cntWA=0;
        int cntTLE=0;
        int cntRE=0;
        while(n>0){
            n--;
            String s = sc.next();
            if(s.equals("AC")){
                cntAC++;
            }
            else if(s.equals("WA")){
                cntWA++;
            }
            else if(s.equals("TLE")){
                cntTLE++;
            }
            else if(s.equals("RE")){
                cntRE++;
            }
        }
        System.out.println(String.format("AC x %d",cntAC));
        System.out.println(String.format("WA x %d",cntWA));
        System.out.println(String.format("TLE x %d",cntTLE));
        System.out.println(String.format("RE x %d",cntRE));
    }
}

