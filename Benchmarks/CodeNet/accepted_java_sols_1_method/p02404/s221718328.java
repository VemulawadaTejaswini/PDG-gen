import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if ( (a!=0) && (b!=0) ) {
                for (int i = 0; i<a; i++) {

                    if((i==0)||(i==(a-1))) {
                        for (int j = 0; j < b; j++) {
                            if (j == (b - 1))
                                System.out.printf("#\n");
                            else
                                System.out.printf("#");
                        }
                    }

                    else {
                        for (int j = 0; j < b; j++) {
                            if (j == (b - 1))
                                System.out.printf("#\n");
                            else if(j==0)
                                System.out.printf("#");
                            else
                                System.out.printf(".");
                        }
                    }
                }
            }
            else
                break;
            System.out.println();
        }
    }
}

