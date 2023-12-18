import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if ((h!=0)&&(w!=0))
            {
                for (int i=1; i<=h; i++) {
                    for (int j=1; j<=w; j++) {
                        if (j!=w) {
                            if (i%2!=0 && j%2!=0)
                                System.out.printf("#");
                            else if (i%2!=0 && j%2==0)
                                System.out.printf(".");
                            else if (i%2==0 && j%2!=0)
                                System.out.printf(".");
                            else if (i%2==0 && j%2==0)
                                System.out.printf("#");
                        }
                        else
                        if (i%2!=0 && j%2!=0)
                            System.out.printf("#\n");
                        else if (i%2!=0 && j%2==0)
                            System.out.printf(".\n");
                        else if (i%2==0 && j%2!=0)
                            System.out.printf(".\n");
                        else if (i%2==0 && j%2==0)
                            System.out.printf("#\n");

                    }
                }
            }
            else
                break;

            System.out.println();
        }
    }

}

