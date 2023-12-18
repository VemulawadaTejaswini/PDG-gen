import java.util.*;
public class Main {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h == 0 && w==0) break;
            for(int i = 0;i<h;i++){
                for(int j = 0;j<w;j++){
                    if(i==0 || i==h-1 || j==0 || j==w-1) System.out.printf("#");
                    else System.out.printf(".");
                }
                System.out.printf("\n");
            }
                System.out.printf("\n");
        }
        sc.close();
    }
}
