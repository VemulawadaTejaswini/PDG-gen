import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long count = 0;
        while(n>1) {
            n = n / 2;
            count++;
        }
        long answer = 0;
        for (int i = 0; i <= count; i++){
            answer += Math.pow(2,i);
        }
        System.out.println(answer);
    }
}
