import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        boolean jdg = false;
        while(num > 0){
            if(num % 4 == 0){
                jdg = true;
                break;
            }
            num -= 7;
        }
        num = tmp;
        while(num > 0){
            if(num % 7 == 0){
                jdg = true;
                break;
            }
            num -= 4;
        }

        System.out.println(jdg?"Yes":"No");
    }
}