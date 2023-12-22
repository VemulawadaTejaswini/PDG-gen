import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0) {
                break;
            } else {
                for (int i = 0; i < h; i++) {
                    if (i == 0 || i == h-1) {

                        for (int j = 0; j < w; j++) {
                            System.out.print('#');
                        }

                    } else {
                        
                        for (int j = 0; j < w; j++) {
                            if (j==0 || j==w-1) {
                                System.out.print('#');
                                
                            } else {
                                System.out.print('.');
                            }
                            
                        }
                    }
                    System.out.println();
                }

                System.out.println();
            }

        } while (true);
    }

}