import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int blackRow = sc.nextInt();
        int blackColumn = sc.nextInt();
        int blackCount = (row*blackColumn+column*blackRow)-(blackRow*blackColumn);
        int allWhite = row*column;
        System.out.println(allWhite-blackCount);

    }
}