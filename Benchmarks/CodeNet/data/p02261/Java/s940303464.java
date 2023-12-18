import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        Value[] arrayForBubble = new Value[size];
        Value[] arrayForSelection = new Value[size];
        for (int i = 0; i < size; i++) {
            Value value = new Value(scanner.next());
            arrayForBubble[i] = value;
            arrayForSelection[i] = value;
        }

        bubbleSort(arrayForBubble);
        System.out.println(concat(arrayForBubble));
        System.out.println("Stable");
        selectionSort(arrayForSelection);
        System.out.println(concat(arrayForSelection));
        System.out.println(same(arrayForBubble, arrayForSelection) ? "Stable"
                : "Not stable");
    }

    private static boolean same(Value[] array1, Value[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].character != array2[i].character) {
                return false;
            }
        }
        return true;
    }

    private static void bubbleSort(Value[] values) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = values.length - 1; j > 0; j--) {
                if (values[j].number < values[j - 1].number) {
                    swap(j, j - 1, values);
                    flag = true;
                }
            }
        }
    }

    private static void selectionSort(Value[] values) {
        for (int i = 0; i < values.length; i++) {
            int mini = i;
            for (int j = i; j < values.length; j++) {
                if (values[j].number < values[mini].number) {
                    mini = j;
                }
            }
            if (i != mini) {
                swap(i, mini, values);
            }
        }
    }

    private static String concat(Value[] array) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Value value : array) {
            joiner.add(value.toString());
        }
        return joiner.toString();
    }

    private static void swap(int i, int j, Value[] array) {
        Value temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static class Value {
        char character;
        int number;

        Value(String value) {
            character = value.charAt(0);
            number = Integer.parseInt(String.valueOf(value.charAt(1)));
        }

        @Override
        public String toString() {
            return character + String.valueOf(number);
        }
    }
}