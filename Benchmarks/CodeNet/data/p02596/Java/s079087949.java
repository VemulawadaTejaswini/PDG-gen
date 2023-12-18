import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int num = 7;
        int res = 1;
        if(k % 2 == 0 || k % 5 == 0){
            System.out.println("-1");
        }else if(k == 1 || k == 7){
            System.out.println("1");
        }else{
            while(num != 0){
                num = (num * 10 + 7) % k;
                res++;
            }
            System.out.println(res);
        }
    }
}