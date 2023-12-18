import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input sc = new Scanner(System.in);
        ArrayList<String> inputWitdhHeights = new ArrayList<String>();
        while (true){
            String inputStrs = inputStr.nextLine();
            if ("0 0".equals(inputStrs)) {
                break;
            }
            inputWitdhHeights.add(inputStrs);
        }
        String space = " ";
        for (String inputNums: inputWitdhHeights) {
            showChessboard(inputNums.split(space));
            System.out.println();
        }
    }

    private static void showChessboard(String[] hw) {
        int h = Integer.parseInt(hw[0]);
        int w = Integer.parseInt(hw[1]);
        if(!isFormatNums(w, h)) {
            throw new NumberFormatException();
        }
        final String sharpStr = "#";
        final String dodStr   = ".";
        StringBuffer[] chessboardPattern = new StringBuffer[] {new StringBuffer(sharpStr), new StringBuffer(dodStr)};
        for(int j = 1; j < w; j++) {
            if (j % 2 == 0) {
                chessboardPattern[0].append(sharpStr);
                chessboardPattern[1].append(dodStr);
            } else {
                chessboardPattern[0].append(dodStr);
                chessboardPattern[1].append(sharpStr);
            }
        }
        for (int i = 0; i < h; i++) {
            System.out.println(chessboardPattern[i % 2]);
        }
    }

    private static boolean isFormatNums(int h, int w) {
        int minNum =   1;
        int maxNum = 300;
        return (minNum <= h && h <= maxNum) && (minNum <= w && w <= maxNum);
    }
}

