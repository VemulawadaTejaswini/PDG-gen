import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        for(int i=0;i<5;i++){
            if(sc.nextInt()==0)
                idx = i;
        }
        System.out.println(++idx);
    }

}
