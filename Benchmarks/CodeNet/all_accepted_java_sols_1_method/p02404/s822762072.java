import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a ==0 && b == 0){
                    break;
                }
                for(int u = 0;u < a;u++){
                    if(u == 0|| u == a-1){
                        for(int e = 0;e < b;e++){
                            System.out.print("#");
                        }
                    }
                    else
                        for(int e = 0; e < b;e++){
                            if(e == 0||e ==b-1){
                                System.out.print("#");
                            }
                        else{
                            System.out.print(".");
                        }
                    }
                    System.out.println("");
                }                   
                System.out.println("");
        }

    }
}
