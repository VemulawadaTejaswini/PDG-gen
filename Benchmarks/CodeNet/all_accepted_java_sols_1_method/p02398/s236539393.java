import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        int i = 0;
        
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        for(;x <= y; x++){
            if(z%x == 0){
                i++;
            }
        }
        System.out.println(i);
        
    }
}

