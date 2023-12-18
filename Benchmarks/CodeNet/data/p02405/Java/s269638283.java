import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        while (!(height == 0 && width == 0)) {
            for (int h = 0; h < height; h++) {
                StringBuilder sb = new StringBuilder();
                if (h % 2 == 0) {
                    for(int w = 0; w < width; w++){
                        if (w % 2 == 0) sb.append('#');
                        else sb.append('.');
                    }
                } else {
                    for(int w = 0; w < width; w++){
                        if(w % 2 == 0) sb.append('.');
                        else sb.append('#');
                    }
                }
                System.out.println(sb);
            }
            System.out.println();
            height = sc.nextInt();
            width = sc.nextInt();
        }
    }
}

