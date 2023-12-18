import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                map[i][j] = sc.nextInt();
            }
        }
        boolean bool = true;
        if(!(map[0][0]-map[0][1] == map[1][0]-map[1][1] && map[0][1]-map[0][2] == map[1][1]-map[1][2] && map[0][0]-map[0][1] == map[2][0]-map[2][1] && map[0][1]-map[0][2] == map[2][1]-map[2][2])) bool = false;
        if(!(map[0][0]-map[1][0] == map[0][1]-map[1][1] && map[1][0]-map[2][0] == map[1][1]-map[2][1] && map[0][0]-map[1][0] == map[0][2]-map[1][2] && map[1][0]-map[2][0] == map[1][2]-map[2][2])) bool = false;
        System.out.println(bool ? "Yes" : "No");
    }
}
