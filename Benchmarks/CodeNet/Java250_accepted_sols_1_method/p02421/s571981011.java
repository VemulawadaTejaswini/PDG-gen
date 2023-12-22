import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int taroPnt = 0;
        int hanakoPnt = 0;
        for(int i=0; i<n; i++) {
            String taro = sc.next();
            String hanako = sc.next();
            if(taro.compareTo(hanako) > 0) {
                taroPnt += 3;
            } else if(taro.compareTo(hanako) == 0) {
                taroPnt += 1;
                hanakoPnt += 1;
            } else {
                hanakoPnt += 3;
            }
        }
        System.out.println(taroPnt + " " + hanakoPnt);
    }
}

