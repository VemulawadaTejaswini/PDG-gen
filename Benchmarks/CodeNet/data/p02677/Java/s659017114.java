import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        
        var a = scaner.nextInt(); // 時針
        var b = scaner.nextInt(); // 分針
        var h = scaner.nextInt();
        var m = scaner.nextInt();

        var x = 360 / 12 * h;
        x = x == 0 ? 360 : x;
        var y = 360 / 60 * m;
        y = y == 0? 360 : y;
        var r = Math.max(x, y) - Math.min(x, y);

        var ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2*a*b) * Math.cos(Math.toRadians(r)));

        System.out.println(ans);

        scaner.close();
    }

}
