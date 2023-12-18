import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int h = scanner.nextInt();
            int s = scanner.nextInt();
            if(h ==0 || s ==0){break;}
            for(int i=0; i<h; i++){
                if(i==0 || i==h-1){
                    for(int j=0; j<s; j++){
                        System.out.print("#");
                    }
                }else{
                    for(int j=0; j<s; j++){
                        if(j==0 || j==s-1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
