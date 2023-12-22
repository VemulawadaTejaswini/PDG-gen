import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        int len = S.length();
        int count = 0;
        // boolean judge = false;

        for (int i = 0; i < len; i++) {
            if (i%2 == 0 && (c[i] == 'R' || c[i] == 'U' || c[i] == 'D')) {
                
            } else if (i%2 == 1 && (c[i] == 'L' || c[i] == 'U' || c[i] == 'D')) {
                
            } else {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}