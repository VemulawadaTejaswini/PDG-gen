import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        //猫がAに満たない場合
        if(a > x){
            System.out.println("NO");
        }
        else{
            //X-A匹の猫がBより大きい場合
            if(b < (x - a)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}