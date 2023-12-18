import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] sArr = sc.next().toCharArray();

        int indexA = sArr.length;
        int indexZ = 0;
        for (int i = 0; i < sArr.length; i++) {
            switch (sArr[i]) {
                case 'A':
                    if (indexA > i) indexA = i;
                    break;
                case 'Z':
                    if (indexZ < i) indexZ = i;
                    break;
            }
        }


        System.out.println(indexZ - indexA + 1);

    }
}
