import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        while(height != 0 || width != 0){
            StringBuilder ceilingFloorStr = new StringBuilder();
            StringBuilder roomStr = new StringBuilder("#");
            for(int w = 0; w < width; w++){
                ceilingFloorStr.append('#');
            }
            for(int w = 1; w < width - 1; w++){
                roomStr.append('.');
            }
            System.out.println(ceilingFloorStr);
            for(int h = 1; h < height - 1; h++){
                System.out.println(roomStr.toString() + '#');
            }
            System.out.println(ceilingFloorStr + System.lineSeparator());
            height = sc.nextInt();
            width = sc.nextInt();
        }
    }
}

