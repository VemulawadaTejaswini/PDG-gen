import java.util.Scanner;
class Main {

    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, y, z, w, q;
        a = x.nextInt();
        if(a>=0 && a<= 86400){
            y = a / 3600;
            z = a % 3600;
            w = z / 60;
            q = z % 60;
            System.out.println(y + ":" + w + ":" + q);
        }
    }
}