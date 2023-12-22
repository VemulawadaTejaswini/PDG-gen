import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int r = sc.nextInt();
        int c = sc.nextInt();
        int data[][] = new int[r+1][c+1];
        for(int x = 0;x<r;x++){
            sc.nextLine();
            for(int y = 0;y<c;y++){
                data[x][y] = sc.nextInt();
                count += data[x][y];
            }
            data[x][c] = count;
            sum += count;
            count = 0;
        }
        data[r][c] = sum;
        for(int y = 0;y<c;y++){
            for(int x = 0;x<r;x++){
                count += data[x][y];
            }
            data[r][y] = count;
            count = 0;
        }

        for(int x = 0;x<=r;x++){
            for(int y = 0;y<=c;y++){
                if(y == 0){
                    System.out.print(data[x][y]);
                }else{
                    System.out.print(" "+data[x][y]);
                }
            }
            System.out.println();
        }
    }
}
