import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int taro = 0, hanako = 0;
            for (int i=0; i<num; i++){
                String a = sc.next();
                String b = sc.next();
                if (a.compareTo(b) > 0) {
                    taro += 3;
                } else if (a.compareTo(b) < 0) {
                    hanako += 3;
                } else {
                    taro += 1;
                    hanako += 1;
                }
            }
            System.out.println(taro + " " + hanako);
        }
    }
}

