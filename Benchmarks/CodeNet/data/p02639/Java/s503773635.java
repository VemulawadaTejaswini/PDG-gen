import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=4; i++) {
            if(sc.nextLong()==0){
                System.out.println(i+1);
            }
        }
    }
}