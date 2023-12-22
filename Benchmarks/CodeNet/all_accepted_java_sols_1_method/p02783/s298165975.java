import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        if (n%h==0){
            System.out.println(n/h);
        }else {
            System.out.println(n/h+1);
        }
    }
}




