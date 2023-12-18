import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();

        int numberProc = inp.nextInt();
        int quantity = inp.nextInt();

        for (int i = 0; i < numberProc; i++) {
            name.add(inp.next());
            time.add(inp.nextInt());
        }

        int finalCount = 0;

        int finalplaceholder = 0;

        String[] finalName = new String[100005];
        int[] finalTime = new int[100005];

        while (!name.isEmpty()) {
            String tempholdName = name.get(0);
            int tempholdTime = time.get(0);

            name.remove(0);
            time.remove(0);

            if (tempholdTime <= quantity) {
                finalCount += tempholdTime;

                finalName[finalplaceholder] = tempholdName;
                finalTime[finalplaceholder] = finalCount;

                finalplaceholder++;
            } else {
                name.add(name.size(), tempholdName);
                time.add(time.size(), (tempholdTime-quantity));

                finalCount += quantity;
            }
        }

        for (int i = 0; i < finalName.length; i++) {
            if (finalName[i] != null) {
                System.out.println(finalName[i] + " " + finalTime[i]);
            } else {
                break;
            }
        }
    }
}

