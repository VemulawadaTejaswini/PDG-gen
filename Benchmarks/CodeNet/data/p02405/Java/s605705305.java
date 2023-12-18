import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loop: while(true){
            int h = sc.nextInt(),w = sc.nextInt();
            if(w == 0 && h == 0) break loop;
            for(int i = 0;i < h;i++){
                for(int j = 0;j < w;j++){
                    if(i % 2 == 0) System.out.print(j % 2 == 0 ? "#" : ".");
                    else System.out.print(j % 2 == 0 ? "." : "#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}