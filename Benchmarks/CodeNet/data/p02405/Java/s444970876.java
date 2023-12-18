import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j;
        int a,b;
        while(true) {
            str = scan.nextLine();
            String[] num = str.split(" ", 0);
            a = Integer.valueOf(num[0]);
            b = Integer.valueOf(num[1]);
            if(a==0&&b==0){
                break;
            }

            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    if((i+j)%2==0){
                    System.out.print("#");

                    }else{
                        System.out.print(".");
                    }

                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
