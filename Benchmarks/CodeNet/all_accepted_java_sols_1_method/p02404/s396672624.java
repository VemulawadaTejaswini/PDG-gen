import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            if(height == 0 && width ==0){
                break;
            }
            for(int i = 0; i < height; i++){
                for(int j = 0; j < width; j++){
                    if((i == 0 || i == height - 1) || (j == 0 || j == width - 1)){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
