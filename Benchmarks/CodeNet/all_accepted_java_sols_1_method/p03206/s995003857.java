import java.util.Scanner;

class Main{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        String ans = "Christmas";
        if(D==24){
            ans += " Eve";
        }else if(D == 23){
            ans += " Eve Eve";
        }else if(D == 22){
            ans += " Eve Eve Eve";
        }
        System.out.print(ans);
    }
}