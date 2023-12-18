import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            for(int i = 0; i < x; i++){
                if(i>2 && i/3 == 0){
                    System.out.print(" "+i);
                }else if(i>2 && i%3 == 0){
                    System.out.print(" "+i);
                }
            }
        }
    }
}

