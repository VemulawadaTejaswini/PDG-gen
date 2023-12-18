import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        char[] c = s.toCharArray();

        int left = 0;
        int right = N-1;
        int answer = 0;
        while(true){
            while(left < N && c[left]!='W') left++;
            while(0 <= right && c[right]!='R') right--;
            if (left < right) {
                answer++;
                left++;
                right--;
            }
            else {
                break;
            }
        }

        System.out.println(answer);
    }

}