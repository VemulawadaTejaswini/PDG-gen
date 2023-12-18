import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cou = 0;
        for(int i = 0 ; i<= n - 3 ; i++ ){
            if(s.charAt(i) == 'A' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C'){
                cou++;
            }
        }
        System.out.println(cou);
        sc.close();
    }
}