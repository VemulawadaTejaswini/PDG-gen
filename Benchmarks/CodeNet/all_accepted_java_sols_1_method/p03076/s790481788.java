import java.util.Scanner;

import java.util.InputMismatchException;

public class Main{
    public static void main(String args[]){
        int time[] = new int[5];

        try{
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < time.length; i++){
                time[i] = scanner.nextInt();
            }
            scanner.close();
        } catch(InputMismatchException e){
            System.out.println(e);
        }

        int extraTimes[] = new int[5];
        int tenTimes[] = new int[5];
        int extraTimesMin = 10;
        int minIndex = 0;
        for(int i = 0; i < extraTimes.length; i++){
            extraTimes[i] = time[i] % 10;
            tenTimes[i] = time[i] / 10;
            if(extraTimes[i] < extraTimesMin && extraTimes[i] != 0){
                extraTimesMin = extraTimes[i];
                minIndex = i;
            }
        }

        int totalTime = 0;
        for(int i = 0; i < time.length; i++){
            if(i != minIndex){
                totalTime += tenTimes[i] * 10;
                if(extraTimes[i] != 0){
                    totalTime += 10;
                }
            }
        }
        totalTime += time[minIndex];
        System.out.println(totalTime);
    }
}
