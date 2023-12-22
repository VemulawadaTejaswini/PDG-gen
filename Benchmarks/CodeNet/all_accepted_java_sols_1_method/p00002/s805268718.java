import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            int count = 0;
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum = a + b;
            while(true){
                if(sum > 0){
                    count++;
                    sum /= 10;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
        
        scan.close();
    }
}

