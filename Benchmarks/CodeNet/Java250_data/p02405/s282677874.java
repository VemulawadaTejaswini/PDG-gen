import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int height = scan.nextInt();
            int width  = scan.nextInt();

            if (height == 0 && width == 0) {
                break;
            }

            writeRectangle(height, width);
        }
        scan.close();
    }

    public static void writeRectangle(int height, int width) {
        for (int i = 0; i < height; i++){
            switch (i % 2) {
            case 0:
                for (int j = 0; j < width; j++) {
                    switch (j % 2) {
                    case 0:
                        System.out.print("#");
                        break;

                    case 1:
                        System.out.print(".");
                        break;
                    }
                }
                break;

            case 1:
                for (int j = 0; j < width; j++) {
                    switch (j % 2) {
                    case 0:
                        System.out.print(".");
                        break;

                    case 1:
                        System.out.print("#");
                        break;
                    }
                }
                break;
            }
            System.out.println();
        }
        System.out.println();
    }

}