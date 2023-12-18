import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        outside:while(true) {
            String num = sc.next();
            int length = num.length();
            int a, b, c, d;

            switch(length){
                case 1:
                    a = num.charAt(0)-'0';
                    if(a==0){
                        break outside;
                    }else{
                        System.out.println(a);
                        break;
                    }
                case 2:
                    a = num.charAt(1)-'0';
                    b = num.charAt(0)-'0';
                    System.out.println(a+b);
                    break;
                case 3:
                    a = num.charAt(2)-'0';
                    b = num.charAt(1)-'0';
                    c = num.charAt(0)-'0';
                    System.out.println(a+b+c);
                    break;
                case 4:
                    a = num.charAt(3)-'0';
                    b = num.charAt(2)-'0';
                    c = num.charAt(1)-'0';
                    d = num.charAt(0)-'0';
                    System.out.println(a+b+c+d);
                    break;
            }
        }
    }
}

