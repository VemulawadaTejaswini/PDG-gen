import java.util.*;
class Main {
    public static void main(String... args) {
        int[][] house1 = new int[3][10];
        int[][] house2 = new int[3][10];
        int[][] house3 = new int[3][10];
        int[][] house4 = new int[3][10];
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        StringBuilder build = new StringBuilder();
        for(int i = 0 ; i < times ; i++) {
            switch(scan.nextInt()) {
                case 1:
                    house1[scan.nextInt()-1][scan.nextInt()-1] += scan.nextInt();
                    break;
                case 2:
                    house2[scan.nextInt()-1][scan.nextInt()-1] += scan.nextInt();
                    break;
                case 3:
                    house3[scan.nextInt()-1][scan.nextInt()-1] += scan.nextInt();
                    break;
                case 4:
                    house4[scan.nextInt()-1][scan.nextInt()-1] += scan.nextInt();
                    break;
            }
        }
        for(int n = 0 ; n < 3 ; n++) {
            for(int j = 0 ; j < 10; j++) {
                build.append(" " + house1[n][j] );
            }
        build.append("\n");
        }
        build.append("####################\n");
        for(int n = 0 ; n < 3 ; n++) {
            for(int j = 0 ; j < 10; j++) {
                build.append(" " + house2[n][j] );
            }
        build.append("\n");
        }
        build.append("####################\n");
        for(int n = 0 ; n < 3 ; n++) {
            for(int j = 0 ; j < 10; j++) {
                build.append(" " + house3[n][j] );
            }
        build.append("\n");
        }
        build.append("####################\n");
        for(int n = 0 ; n < 3 ; n++) {
            for(int j = 0 ; j < 10; j++) {
                build.append(" " + house4[n][j] );
            }
        build.append("\n");
        }
        System.out.print(build.toString());
    }
}

                


