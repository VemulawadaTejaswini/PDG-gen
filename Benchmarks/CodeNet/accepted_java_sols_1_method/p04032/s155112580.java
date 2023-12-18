import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int start = -1;
        int end = -1;
        int size = input.length();
        for(int i = 0; i < size; i++){
            if( i + 1 < size) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    start = i + 1;
                    end = i + 2;
                }
            }
            if(i + 2 < size){
                if(input.charAt(i) == input.charAt(i + 2)){
                    start = i + 1;
                    end = i + 3;
                }
            }
        }
        System.out.println(start + " " + end);

    }
}
