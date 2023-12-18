
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static class KMP {

        String pattern;
        int[] t;

        public KMP(String pattern) {
            this.pattern = pattern;
            buildTable();
        }

        void buildTable() {
            t = new int[pattern.length()];
            if (t.length == 0) {
                return;
            }
            t[0] = -1;
            for (int i = 1; i < pattern.length(); i++) {
                if (t[i - 1] == -1) {
                    t[i] = 0;
                } else if (pattern.charAt(t[i - 1]) == pattern.charAt(i - 1)) {
                    t[i] = t[i - 1] + 1;
                } else {
                    t[i] = pattern.charAt(0) == pattern.charAt(i - 1) ? 1 : 0;
                }
            }
        }

        /**
         *
         * @param text
         * @param beginIdx inclusive
         * @return Index of text where the pattern begins. If not found returns -1
         */
        public int search(String text, int beginIdx) {
            if (t.length == 0) {
                return beginIdx;
            } else if (beginIdx >= text.length()) {
                return -1;
            }

            int textBeginIdx = beginIdx;
            int patternIdx = 0;
            while (textBeginIdx + patternIdx < text.length()) {
                if (text.charAt(textBeginIdx + patternIdx) == pattern.charAt(patternIdx)) {
                    if (patternIdx == pattern.length() - 1) {
                        return textBeginIdx;
                    } else {
                        patternIdx++;
                    }
                } else if (t[patternIdx] > -1) {
                    textBeginIdx = textBeginIdx + patternIdx - t[patternIdx];
                    patternIdx = t[patternIdx];
                } else {
                    textBeginIdx++;
                    patternIdx = 0;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String pattern = in.nextLine();

        KMP kmp = new KMP(pattern);

        int posFound = 0;
        while (posFound < text.length()) {
            posFound = kmp.search(text, posFound);
            if (posFound == -1) {
                break;
            }
            System.out.println(posFound);
            posFound++;

        }

    }
}