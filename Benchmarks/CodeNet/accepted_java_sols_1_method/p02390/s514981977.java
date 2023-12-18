import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int h,m,s;
        Scanner timeScan = new Scanner(System.in);
        int time = timeScan.nextInt();

        h = 0;
        m = 0;
        s = 0;

        if(time < 0 || 86400 < time) {
            throw new RuntimeException("範囲外");
        }
        s = time % 60;
        m = (time / 60) % 60;
        h = (time / 60) / 60;

        System.out.println(h+":"+m+":"+s);
    }
}