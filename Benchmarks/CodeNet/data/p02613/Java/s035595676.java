import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        
        int a = 0;
        int w = 0;
        int t = 0;
        int r = 0;
        for(int i = 0; i < n; i++){
            String s = sc.next();
            switch(s){
                case "AC":
                    a++;
                    break;
                case "WA":
                    w++;
                    break;
                case "TLE":
                    t++;
                    break;
                case "RE":
                    r++;
                    break;
            }
        }
        System.out.println("AC x " + a);
        System.out.println("WA x " + w);
        System.out.println("TLE x " + t);
        System.out.println("RE x " + r);
    }
}