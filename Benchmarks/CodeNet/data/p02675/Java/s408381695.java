import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        String ans = "";
        if(n == 2 || n == 4 || n == 5 || n == 7 || n == 9){
            ans = "hon";
        }else if(n == 3){
            ans = "bon";
        }else{
            ans = "pon";
        }
        System.out.println(ans);
    }
}

