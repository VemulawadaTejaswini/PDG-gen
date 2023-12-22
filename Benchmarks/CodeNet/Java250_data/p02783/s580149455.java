import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int monsterHP;
        int attackDMG;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editInputData = inputData.split(" ");

        monsterHP = Integer.parseInt(editInputData[0]);
        attackDMG = Integer.parseInt(editInputData[1]);

        int count = 0;

        while(monsterHP > 0) {
            monsterHP -= attackDMG;
            count++;
        }

        System.out.println(count);

    }
}