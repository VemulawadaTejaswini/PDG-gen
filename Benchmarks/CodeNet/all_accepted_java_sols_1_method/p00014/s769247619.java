import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int area = 0;
            int d = sc.nextInt();
            for(int i=0 ; i<600 ;i+=d)
                area += i*i*d;
            System.out.println(area);
        }
    }
}