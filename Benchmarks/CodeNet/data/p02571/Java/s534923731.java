import java.util.Scanner;

public class Main{
    private static int memo(String a, String b, int i, int j){
        if(j==b.length()){
            return 0;
        }
        if(i == a.length()){
            return 2000;
        }
        if(a.charAt(i)==b.charAt(j)){
            return Math.min(memo(a, b, i+1, 0), memo(a, b, i+1, j+1));
        }else{
            return Math.min(memo(a, b, i+1, 0), 1 + memo(a, b, i+1, j+1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(memo(a, b, 0, 0));
        sc.close();
    }
}