import java.util.Scanner;
class Main {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String seiseki[] ={"A","B","C","D","F"};
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        while(m != -1 || f != -1 || r != -1){
            if(m == -1 || f == -1 || m+f < 30) a = 4;
            else if(m+f >= 80) a = 0;
            else if(m+f >= 65) a = 1;
            else if(m+f >= 50 || r >= 50) a = 2;
            else if(m+f >= 30) a = 3;
            System.out.println(seiseki[a]);
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
        }
    }
}