import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            //for(int i = 0;;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a ==0 && b == 0){
                    break;
                }
                for(int u = 1;u <= a;u++){
                    for(int e = 0; e < b;e++){
                        System.out.print("#");
                    }
                    System.out.println("");

                }                   System.out.println("");
            //}        sc.close(); 
        }

    }
}
