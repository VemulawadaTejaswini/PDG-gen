import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = h*60 + m;
        
        double len = 0;
        double rad = 0;
        double hh = 0;
        double mm = 0;

        for(int i=0; i<time; i++) {
            hh += 0.5;
            mm += 6;
        }
        hh = hh % 360;
        mm = mm % 360;
        //System.out.println(hh);
        //System.out.println(mm);
        rad = Math.abs(hh - mm);


        len = Math.sqrt(Math.pow(a,2)+Math.pow(b,2) - 2*a*b* Math.cos(Math.toRadians(rad)));
        System.out.println(len);
    }
}