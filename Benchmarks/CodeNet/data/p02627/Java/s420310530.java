import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = 'A';
        boolean f = false;
        for(int i=0;i<26;i++){
            if(String.valueOf(c).equals(a)){
                f = true;
                break;
            }
            c++;
        }

        System.out.println(f?"A":"a");
    }

}
