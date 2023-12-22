import java.util.Scanner;

public class Main {

    public static int findMaxConsecutiveDays(String weatherString){
        int maxDays =0;

        char[] weatherChar = weatherString.toCharArray();
//        for(char character:weatherChar){
//            System.out.println(character);
//        }

        int temporaryCount = 0;
        for(int i =0 ;i<weatherChar.length;i++){
            if(weatherChar[i] == 'R'){
                temporaryCount++;
            }else{
                if(temporaryCount>maxDays) {
                    maxDays = temporaryCount;
                }
                temporaryCount =0;
            }
        }
        if(temporaryCount>maxDays) {
            maxDays = temporaryCount;
        }
        return maxDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(findMaxConsecutiveDays(str));
        scanner.close();
    }
}