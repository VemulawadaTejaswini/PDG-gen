import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    sc.close();
    int r = 0;
    

    if( d % s == 0) r = d / s;
    else r = d / s + 1;

    

    if(r <= t){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

}
}