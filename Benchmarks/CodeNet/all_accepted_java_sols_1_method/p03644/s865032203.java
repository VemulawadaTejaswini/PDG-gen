import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();

        int dividedCount = 0;
        int currentDividedCount = 0;
        int tmp = 0;
        int output = 0;
        int target = 0;

        for(int i=givenNumber; i>0; i--) {
            if(givenNumber == 1) {
                output = 1;
                break;
            }
            if(i % 2 == 0) {
                target = i;
                tmp = i;
                while(true) {
                    if(target % 2 != 0) {
                        break;
                    } else {
                        dividedCount += 1;
                        target /= 2;
                    }
                }
                if(currentDividedCount < dividedCount) {
                    currentDividedCount = dividedCount;
                    output = tmp;
                }
                dividedCount = 0;
            }
        }
        System.out.println(output);
    }
}
