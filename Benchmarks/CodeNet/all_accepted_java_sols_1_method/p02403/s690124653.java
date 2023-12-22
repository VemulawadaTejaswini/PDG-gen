import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=0,w=0;
        while((h=sc.nextInt())!=0&&(w=sc.nextInt())!=0)
        {
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}
