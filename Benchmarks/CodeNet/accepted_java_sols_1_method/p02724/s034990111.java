import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int hp=0;
        while(x>=500){
            x-=500;
            hp+=1000;
        }
        while(x>=5){
            x-=5;
            hp+=5;
        }
        System.out.println(hp);
    }
}
