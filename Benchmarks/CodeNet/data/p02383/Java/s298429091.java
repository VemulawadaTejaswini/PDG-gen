import java.util.*;

public class Main {

    private static int top;
    private static int front;
    private static int left;
    private static int right;
    private static int back;
    private static int bottom;
    private static String instructionsStr;
    private static Map<Character, Instruction> directionEnumMap = new HashMap<>();

    public static void main(String[] args) {
        readStanderdInput();
        setInstructionEnumMap();

        Dice dice = new Dice(top, front, left, right, back, bottom);
        DiceOperator diceOperator = new DiceOperator();
        List<Instruction> instructions = stringToInstructions(instructionsStr);

        diceOperator.roll(dice, instructions);

        System.out.println(dice.top());
    }

    // ?????????????????????????????????????¨??????\????????????????????????????????£???????????????????????????
    private static void readStanderdInput() {
        Scanner scanner = new Scanner(System.in);
        top = scanner.nextInt();
        front = scanner.nextInt();
        left = scanner.nextInt();
        right = scanner.nextInt();
        back = scanner.nextInt();
        bottom = scanner.nextInt();
        scanner.nextLine();
        instructionsStr = scanner.nextLine();
        scanner.close();
    }

    // 'W','S','N','E' ????????????Enum???????????????????????¨???????????????Map????¨????
    private static void setInstructionEnumMap(){
        directionEnumMap.put('W', Instruction.WEST);
        directionEnumMap.put('E', Instruction.EAST);
        directionEnumMap.put('S', Instruction.SOUTH);
        directionEnumMap.put('N', Instruction.NORTH);
    }

    private static List<Instruction> stringToInstructions(String instructionsStr) {
        List<Instruction> instructions = new ArrayList<>();

        for (int i = 0; i < instructionsStr.length(); i++) {
            instructions.add(Main.directionEnumMap.get(instructionsStr.charAt(i)));
        }

        return instructions;
    }
}

class DiceOperator {

    void roll(Dice dice, List<Instruction> instructions){

        for (Instruction instruction : instructions){
            switch (instruction) {
                case EAST:
                    dice.rollToEast();
                    break;
                case WEST:
                    dice.rollToWest();
                    break;
                case NORTH:
                    dice.rollToNorth();
                    break;
                case SOUTH:
                    dice.rollToSouth();
            }
        }
    }
}



class Dice {

    private static final String TOP = "TOP";
    private static final String FRONT = "FRONT";
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final String BACK = "BACK";
    private static final String BOTTOM = "BOTTOM";

    private Map<String, Integer> positions = new HashMap<>();

    Dice(int top, int front, int left, int right, int back, int bottom) {
        setPositions(top, front, left, right, back, bottom);
    }

    void rollToWest() {
        setPositions(positions.get(LEFT), positions.get(FRONT), positions.get(BOTTOM), positions.get(TOP), positions.get(BACK), positions.get(RIGHT));
    }

    void rollToEast() {
        setPositions(positions.get(RIGHT), positions.get(FRONT), positions.get(TOP), positions.get(BOTTOM), positions.get(BACK), positions.get(LEFT));
    }

    void rollToNorth() {
        setPositions(positions.get(FRONT), positions.get(BOTTOM), positions.get(LEFT), positions.get(RIGHT), positions.get(TOP), positions.get(BACK));
    }


    void rollToSouth() {
        setPositions(positions.get(BACK), positions.get(TOP), positions.get(LEFT), positions.get(RIGHT), positions.get(BOTTOM), positions.get(FRONT));
    }

    private void setPositions(int top, int front, int left, int right, int back, int bottom){
        positions.put(TOP, top);
        positions.put(FRONT, front);
        positions.put(LEFT, left);
        positions.put(RIGHT, right);
        positions.put(BACK, back);
        positions.put(BOTTOM, bottom);
    }

    int top() {
        return positions.get(TOP);
    }
}

enum Instruction {
    EAST,
    WEST,
    SOUTH,
    NORTH,
}