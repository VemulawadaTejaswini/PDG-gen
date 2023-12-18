import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line;
            Dice dice = new Dice();

            int total = dice.getTop();
            try {
                line = br.readLine();
                int numOfInstructions = Integer.parseInt(line);
                if (numOfInstructions == 0) {
                    System.exit(0);
                }

                for (int i = 0; i < numOfInstructions; i++) {
                    line = br.readLine();
                    total += dice.roll(Instruction.valueOf(line));
                }
            } catch (IOException e) {
                System.exit(-1);
            }
            System.out.println(total);
        }
    }
}

abstract class Instruction {
    public static final int SUM_OF_OPPOSITE_SURFACE = 7;
    public static Instruction valueOf(String s) {
        Instruction obj;
        switch (s) {
            case "North":
                obj = new North();
                break;
            case "South":
                obj = new South();
                break;
            case "East":
                obj = new East();
                break;
            case "West":
                obj = new West();
                break;
            case "Right":
                obj = new Right();
                break;
            case "Left":
                obj = new Left();
                break;
            default:
                throw new RuntimeException("Undefined instruction");
        }

        return obj;
    }
    abstract Surfaces roll(Surfaces surfaces);
}
class North extends Instruction {
    Surfaces roll(Surfaces surfaces) {
        return new Surfaces(surfaces.south,
                SUM_OF_OPPOSITE_SURFACE - surfaces.top,
                surfaces.east);
    }
}
class East extends Instruction {
    Surfaces roll(Surfaces surfaces) {
        return new Surfaces(SUM_OF_OPPOSITE_SURFACE - surfaces.east,
                surfaces.south, surfaces.top);
    }
}
class South extends Instruction {
    Surfaces roll(Surfaces surfaces) {
        return new Surfaces(SUM_OF_OPPOSITE_SURFACE - surfaces.south,
                surfaces.top, surfaces.east);
    }
}
class West extends Instruction {
    Surfaces roll(Surfaces surfaces) {
        return new Surfaces(surfaces.east,
                surfaces.south, SUM_OF_OPPOSITE_SURFACE - surfaces.top);
    }
}
class Right extends Instruction {
    Surfaces roll(Surfaces surfaces) {
        return new Surfaces(surfaces.top,
                surfaces.east, SUM_OF_OPPOSITE_SURFACE - surfaces.south);
    }
}
class Left extends Instruction {
    Surfaces roll(Surfaces surfaces) {
        return new Surfaces(surfaces.top,
                SUM_OF_OPPOSITE_SURFACE - surfaces.east, surfaces.south);
    }
}

class Surfaces {
    public int top;
    public int south;
    public int east;

    Surfaces(int top, int south, int east) {
        this.top = top;
        this.south = south;
        this.east = east;
    }
}

class Dice {
    private Surfaces surfaces = new Surfaces(1, 2, 3);

    public int getTop() {
        return surfaces.top;
    }

    public int roll(Instruction instruction) {
        surfaces = instruction.roll(surfaces);
        return surfaces.top;
    }
}