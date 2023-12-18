import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char first = '8';
        char second = '8';

        int cntFirst = 0;
        int cntSecond = 0;

        for(char c: text.toCharArray()){
            if(c == first){
                cntFirst++;
            }else if(c == second){
                cntSecond++;
            }else if(first == '8'){
                first = c;
                cntFirst = 1;
            }else if(second == '8'){
                second = c;
                cntSecond = 1;
            }
        }

        if(cntFirst == 2 && cntSecond ==2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}