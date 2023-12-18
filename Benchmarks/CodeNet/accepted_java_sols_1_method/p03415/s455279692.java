import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] grid = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<grid.length; i++)
        	grid[i] = sc.next();

        for (int i=0; i<grid.length; i++)
        	System.out.print(grid[i].charAt(i));

        System.out.print("\n");

        sc.close();
    }
}
