import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        double t = scanner.nextDouble();
        double s = scanner.nextDouble();
        if(d/s > t){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}