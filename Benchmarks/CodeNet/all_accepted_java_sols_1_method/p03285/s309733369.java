import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();

        boolean flag=false;
        for (int a = 0; a <= A; a=a+4) {
            for(int b=0;b<=A;b=b+7){
                if (a+b==A){
                    flag=true;
                }
            }
        }
        if (flag==false){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
