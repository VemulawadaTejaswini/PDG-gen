import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        while(true){
            int h = sc.nextInt();
        int w = sc.nextInt();
        if(h==0&&w==0)break;
        for(int i = 0;i<h;i++){
            for(int j = 0;j<w;j++){
                if((j%2+i%2)%2==0){
                    System.out.print('#');
                }
                else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
        System.out.println();
        }
        
        sc.close();
    }
}
