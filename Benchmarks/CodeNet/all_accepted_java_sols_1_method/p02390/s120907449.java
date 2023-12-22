import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double S = Integer.parseInt(line);

        double h = Math.floor(S / 3600);
        double H = S % 3600;
        double m = Math.floor(H / 60);
        double s = H % 60; 

        int ho = (int)h;
        int mo = (int)m;
        int so = (int)s;

        System.out.println(ho + ":" + mo + ":" + so);
    }   
}