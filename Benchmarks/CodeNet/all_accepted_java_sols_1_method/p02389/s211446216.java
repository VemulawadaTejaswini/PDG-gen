import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String[] inputStrArray = input.split(" ");
        int[] intputIntArray = new int[inputStrArray.length];
 
        for (int index = 0; index < intputIntArray.length; index++) {
            intputIntArray[index] = Integer.parseInt(inputStrArray[index]);
        }
        // 面積
        int squareSize = intputIntArray[0] * intputIntArray[1];
        // 周
        int squareLength = (intputIntArray[0] + intputIntArray[1]) * 2;
 
        System.out.println(squareSize + " " + squareLength );
 
    }
}
