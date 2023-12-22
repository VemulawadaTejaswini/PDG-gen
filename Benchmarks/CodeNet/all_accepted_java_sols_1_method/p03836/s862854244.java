import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();

        int tx = sc.nextInt();
        int ty = sc.nextInt();

        int dx = tx - sx;
        int dy = ty - sy;

        StringBuilder path = new StringBuilder();

        for(int i = 0; i < dy; i++)
        	path.append('U');
        for(int i = 0; i < dx; i++)
        	path.append('R');

        for(int i = 0; i < dy; i++)
        	path.append('D');
        for(int i = 0; i < dx; i++)
        	path.append('L');

        path.append('L');
        for(int i = 0; i < dy+1; i++)
        	path.append('U');
        for(int i = 0; i < dx+1; i++)
        	path.append('R');
        path.append('D');

        path.append('R');
        for(int i = 0; i < dy+1; i++)
        	path.append('D');
        for(int i = 0; i < dx+1; i++)
        	path.append('L');
        path.append('U');

        System.out.println(path.toString());
    }

}   