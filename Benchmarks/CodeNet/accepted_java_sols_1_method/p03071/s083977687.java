import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] S = s.split(" ");
        int a = Integer.parseInt(S[0]);
        int b = Integer.parseInt(S[1]);
        int count = 0;

        for(int i = 0; i < 2; i++) {
            if(a > b) {
                count += a;
                a--;             
            }else{
                count += b;
                b--;
            }
        }
        System.out.println(count);
    }
}