import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,x;
        int a;
        str = scan.nextLine();
        a = Integer.valueOf(str);
        for(i=1;i<=a;i++){
            if(i%3==0){
                System.out.print(" "+i);
            }else{
                x = i;
                while(x > 0){
                    if(x % 10==3){
                        System.out.print(" "+i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
        System.out.println();
        scan.close();
    }
}
