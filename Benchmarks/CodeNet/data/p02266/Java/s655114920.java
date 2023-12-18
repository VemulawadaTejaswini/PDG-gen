import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String crossSection = in.nextLine();
        int highIndex = 0;
        int height = 0;
        int maxHeight = 0;
        for (int i = 0; i < crossSection.length(); i++) {
            char c = crossSection.charAt(i);
            if (c == '/') {
                height++;
            } else if (c == '\\') {
                height--;
            }

            if (height > maxHeight) {
                maxHeight = height;
                highIndex = i;
            }
        }

        List<Integer> areas;
        if (highIndex == 0) {
            areas = findAreas(reverseCrossSection(crossSection));
            Collections.reverse(areas);
        } else if (highIndex == crossSection.length() - 1) {
            areas = findAreas(crossSection);
        } else {
            String firstPart = crossSection.substring(0, highIndex + 1);
            String secondPart = reverseCrossSection(crossSection.substring(highIndex + 1));
            List<Integer> areas1 = findAreas(firstPart);
            List<Integer> areas2 = findAreas(secondPart);
            areas = new ArrayList<>(areas1);
            Collections.reverse(areas2);
            areas.addAll(areas2);
        }

        int totalArea = 0;
        for (Integer area : areas) {
            totalArea += area;
        }

        System.out.println(totalArea);
        System.out.print(areas.size());

        for (Integer area : areas) {
            System.out.print(" " + area);
        }

        System.out.println();
    }

    private static String reverseCrossSection(String crossSection) {
        String reversed = new StringBuilder(crossSection).reverse().toString();
        reversed = reversed.replace('/', 'u');
        reversed = reversed.replace('\\', '/');
        reversed = reversed.replace('u', '\\');
        return reversed;
    }

    private static List<Integer> findAreas(String crossSection) {
        Stack<Character> downStack = new Stack<>();
        int currentArea = 0;
        List<Integer> areas = new ArrayList<>();
        for (int i = 0; i < crossSection.length(); i++) {
            char c = crossSection.charAt(i);
            switch (c) {
                case '/':
                    if (!downStack.empty()) {
                        currentArea += downStack.size() * 2 - 1;
                        downStack.pop();
                        if (downStack.empty()) {
                            areas.add(currentArea / 2);
                            currentArea = 0;
                        }
                    }
                    break;
                case '\\':
                    downStack.push(c);
                    currentArea += downStack.size() * 2 - 1;
                    break;
                case '_':
                    currentArea += downStack.size() * 2;
                    break;
            }
        }
        return areas;
    }
}

