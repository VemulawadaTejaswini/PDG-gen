import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h;
        int w;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h==0&&w==0){
                break;
            }
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(i%2==0){
                        if(j%2==0){
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if(j%2==0){
                            System.out.print(".");
                        } else {
                            System.out.print("#");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
