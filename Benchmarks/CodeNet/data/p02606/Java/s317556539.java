import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int D = scan.nextInt();
        int d = scan.nextInt();
        int count = 0;
        for(int i=L;i<=D;i++){
            if(i%d==0){
                count++;
            }
        }
        System.out.println(count);



    }
}