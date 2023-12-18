import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;
        s = S%60;
        if(S/60<60){
            m = S/60;
            h = 0;
        }else{
            h = S/3600;
            m = S/60%60;
        }
        System.out.println(h+":"+m+":"+s);
        sc.close();
    }   

}
