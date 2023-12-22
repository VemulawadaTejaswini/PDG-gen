import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean b = true;
        int count = x;
        while (b){
            boolean c = true;
            for (int i=2;i<=Math.sqrt(x)&&c;i++){
                    if (count%i==0){
                        c=false;
                        count++;
                    }
            }
            if (c){
                System.out.println(count);
                b=false;
            }
        }


    }

}