import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            A[i] = str.charAt(i);
        }
        if (A[0] == A[1] || A[1] == A[2] || A[2] == A[3]) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}