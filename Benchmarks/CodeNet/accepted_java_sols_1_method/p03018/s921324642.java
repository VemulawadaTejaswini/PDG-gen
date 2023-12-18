import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long res = 0;

        int mode = 0;
        int a = 0;
        for(char c : sc.next().toCharArray()) {
            switch(mode) {
                case 0:
                    if(c == 'A') {
                        a++;
                    } else if(c == 'B') {
                        mode = 1;
                    } else if(c == 'C') {
                        a = 0;
                    }
                    break;
                case 1:
                    if(c == 'A') {
                        a = 1;
                        mode = 0;
                    } else if(c == 'B') {
                        a = 0;
                        mode = 0;
                    } else if(c == 'C') {
                        res += a;
                        mode = 0;
                    }
                    break;
            }
        }
        System.out.println(res);

    }


}
