import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int d = sc.nextInt();
            int num = 600/d;
            long area = 0;
            for(int i=0;i<num;i++){
                area += d*(d*i)*(d*i);
            }
            System.out.println(area);
        }
    }
}