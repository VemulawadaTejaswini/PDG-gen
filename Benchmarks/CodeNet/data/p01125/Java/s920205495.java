import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            Boolean points[][] = new Boolean[21][21];
            Boolean positions[][] = new Boolean[21][21];
            for (int i = 0; i < 21; i++) {
                for (int j = 0; j < 21; j++) {
                    points[i][j] = false;
                    positions[i][j] = false;
                }
            }

            int currentX=10,currentY = 10;
            positions[currentX][currentX] = true;


            for (int i = 0; i < n; i++) {
                points[sc.nextInt()][sc.nextInt()] = true;
            }

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String direction = sc.next();
                int distance = sc.nextInt();
                if (direction.endsWith("N")){
                    for (int j = 0; j < distance; j++ ){
                        currentY +=1;
                        positions[currentX][currentY] = true;
                    }
                }else if (direction.endsWith("E")){
                    for (int j = 0; j < distance; j++ ){
                        currentX +=1;
                        positions[currentX][currentY] = true;
                    }
                }else if (direction.endsWith("S")) {
                    for (int j = 0; j < distance; j++) {
                        currentY -= 1;
                        positions[currentX][currentY] = true;
                    }
                }else if (direction.endsWith("W")){
                    for (int j = 0; j < distance; j++ ){
                        currentX -=1;
                        positions[currentX][currentY] = true;
                    }
                }
            }

            int get_count = 0;
            for (int i = 0; i < 21; i++) {
                for (int j = 0; j < 21; j++) {
                    if (points[i][j] && positions[i][j]){
                        get_count +=1;
                    }
                }
            }

            if (get_count == n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
