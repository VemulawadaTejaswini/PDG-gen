import java.util.ArrayList;
import java.util.Scanner;

public class EditText {
    static final int MAXINPUTLINE = 10;
    static final int MAXINPUTCOMMAND = 300;
    static final int MAXMODIFIEDTEXTLINE = 100;
    static final int MAXMODIFIERTEXTCHAR = 1000;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> modifyingText = new ArrayList<String>();
    static String buffer;
    static int cursorLocLine = 0;
    static int cursorLocRow = 0;

    public static void main(String args[]) {
        ArrayList<String> inputText;
        ArrayList<String> inputCommand;

        inputText = giveTextLine();
        System.out.println("==============================");
        System.out.println("give Text Success");

        inputCommand = giveCommand();

        System.out.println("==============================");
        System.out.println("give Command Success");
        modifyText(inputText, inputCommand);

        for (int i = 0; i < modifyingText.size(); i++) {
            int outLen = modifyingText.get(i).length();
            System.out.println(modifyingText.get(i).substring(0,outLen-1));
        }
    }

    private static ArrayList<String> giveTextLine() {
        String input;
        ArrayList<String> inputText = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXINPUTLINE; i++) {
            input = scan.nextLine();
            if (input.equals("END_OF_TEXT")) break;
            inputText.add(i, input);
        }
        return inputText;
    }

    private static ArrayList<String> giveCommand() {
        String input;
        ArrayList<String> inputCommand = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXINPUTCOMMAND; i++) {
            input = scan.nextLine();
            if (input.equals("-")) break;
            inputCommand.add(i, input);
        }
        return inputCommand;
    }

    private static void modifyText(final ArrayList<String> inputText, final ArrayList<String> inputCommand) {

        for (int i = 0; i < inputText.size(); i++) {
            modifyingText.add(i, inputText.get(i) + "$");
        }

        for (int i = 0; i < inputCommand.size(); i++) {
            System.out.println("===============================");
            System.out.println(inputCommand.get(i) + " " + cursorLocRow + " " + cursorLocLine + " " + modifyingText.get(cursorLocLine).length() + " " + buffer);
            System.out.println("===============================");
            modifyingText.forEach(System.out::println);

            if (inputCommand.get(i).equals("a")) editA();
            else if (inputCommand.get(i).equals("e")) editE();
            else if (inputCommand.get(i).equals("p")) editP();
            else if (inputCommand.get(i).equals("n")) editN();
            else if (inputCommand.get(i).equals("f")) editF();
            else if (inputCommand.get(i).equals("b")) editB();
            else if (inputCommand.get(i).equals("d")) editD();
            else if (inputCommand.get(i).equals("k")) editK();
            else if (inputCommand.get(i).equals("y")) editY();
        }
    }

    private static String remove(String str, int removeIndex) {
        StringBuilder builder = new StringBuilder(str);
        return builder.deleteCharAt(removeIndex).toString();
//        return str.substring(0, removeIndex) + str.substring(removeIndex + 1);
    }

    private static String insert(String str, int insertIndex) {
//        return str.substring(0, insertIndex) + buffer + str.substring(insertIndex);
        StringBuilder builder = new StringBuilder(str);

        if (builder.length() <= insertIndex) {
            return builder.append(buffer).toString();
        } else {
            return builder.insert(insertIndex, buffer).toString();
        }
    }

    private static void editA() {
        cursorLocRow = 0;
    }

    private static void editE() {
        cursorLocRow = modifyingText.get(cursorLocLine).length() - 1;
    }

    private static void editP() {
        cursorLocRow = 0;
        if (cursorLocLine > 0) cursorLocLine--;
    }

    private static void editN() {
        cursorLocRow = 0;
        if (modifyingText.size() <= cursorLocLine + 1) return;

        if (modifyingText.get(cursorLocLine + 1) != null) cursorLocLine++;
    }

    private static void editF() {
        if (modifyingText.get(cursorLocLine).length() == cursorLocRow + 1) {
            if (modifyingText.size() <= cursorLocLine + 1) return;
            cursorLocLine++;
            cursorLocRow = 0;
        } else {
            cursorLocRow++;
        }
    }

    private static void editB() {
        if (cursorLocRow > 0) cursorLocRow--;
        else if (cursorLocLine > 0) {
            cursorLocRow = modifyingText.get(cursorLocLine - 1).length() - 1;
            cursorLocLine--;
        }
    }

    private static void editD() {
//        if (cursorLocRow != modifyingText.get(cursorLocLine).length() - 1) {
        modifyingText.set(cursorLocLine, remove(modifyingText.get(cursorLocLine), cursorLocRow));

//        } else if (modifyingText.get(cursorLocLine + 1) != null) {

        if (modifyingText.get(cursorLocLine).length() == cursorLocRow) {
            for (int i = cursorLocLine; i < modifyingText.size(); i++) {
                if(modifyingText.size() >= i + 1) break;
//                if (modifyingText.get(i + 1) == null) break;
                modifyingText.add(i, modifyingText.get(i) + modifyingText.get(i + 1));
            }
        }
    }

    private static void editK() {
        if (cursorLocRow == modifyingText.get(cursorLocLine).length() - 1 && modifyingText.size() <= cursorLocLine + 1) {
            for (int i = cursorLocLine; i < modifyingText.size(); i++) {
                if (modifyingText.size() <= cursorLocLine + 1) break;
                modifyingText.add(i, modifyingText.get(i) + modifyingText.get(i + 1));
            }
            if(cursorLocLine != modifyingText.size() - 1) buffer = "\n";
        } else {
            if (cursorLocRow < 0) return;

            buffer = modifyingText.get(cursorLocLine).substring(cursorLocRow, modifyingText.get(cursorLocLine).length() - 1);
            if(cursorLocRow == 0) modifyingText.set(cursorLocLine, "$");
            else modifyingText.add(cursorLocLine, modifyingText.get(cursorLocLine).substring(0, cursorLocRow - 1));
        }
    }

    private static void editY() {
        if (buffer != null) {
            if (buffer.equals("\n")) {

                String movingText = modifyingText.get(cursorLocLine).substring(cursorLocRow);

                if (cursorLocRow != 0) {
                    modifyingText.add(cursorLocLine, modifyingText.get(cursorLocLine).substring(0, cursorLocRow - 1));
                }

                modifyingText.add("");
                for (int i = modifyingText.size() - 1; i != cursorLocLine; i--) {
                    modifyingText.set(i, modifyingText.get(i - 1));
                }
                modifyingText.add(cursorLocLine + 1, movingText);
                cursorLocLine++;
                cursorLocRow = 0;
            } else {
                modifyingText.set(cursorLocLine, insert(modifyingText.get(cursorLocLine), cursorLocRow));
            }
        }
    }
}
