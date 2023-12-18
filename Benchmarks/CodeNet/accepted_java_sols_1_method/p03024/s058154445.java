import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
        int n = result.length(), win=0;
        for(int i=0;i<n;i++){
            if(result.charAt(i) == 'o'){
                win++;
            }
        }
        if(8 - win <= 15 - n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
