import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int res = 700;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i=0; i<3; i++){
            if (input.charAt(i) == 'o')res += 100;
        }

        System.out.println(res);
        
        sc.close();

    }
}