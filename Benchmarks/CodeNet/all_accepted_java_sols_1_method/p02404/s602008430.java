import java.util.*;

public class Main{
    public static void main(String[] args){
        int h;
        int w;
        int i = 0;
        int j = 0;
        String n = System.getProperty("line.separator");
        Scanner scanner = new Scanner(System.in);
        while(true){
            h = scanner.nextInt();
            w = scanner.nextInt();
            if(h == 0 && w == 0) break;
            else{
                while(i < h){
                    while(j < w){
                        if(i == 0 || i == h-1 || j == 0 || j == w-1){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");
                        }
                        j++;
                    }
                    j = 0;
                    System.out.print(n);
                    i++;
                }
                i = 0;
                System.out.print(n);
            }
        }
        scanner.close();
    }
}
