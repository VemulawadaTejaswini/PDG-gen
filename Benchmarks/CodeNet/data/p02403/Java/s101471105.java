import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        while(width != 0 || height != 0){
            StringBuilder sb = new StringBuilder();
            for(int w = 0; w < width; w++){
                sb.append('#');
            }
            for(int h = 0; h < height; h++){
                System.out.println(sb.toString());
            }
            System.out.println();
            height = sc.nextInt();
            width = sc.nextInt();
        }
    }
}

