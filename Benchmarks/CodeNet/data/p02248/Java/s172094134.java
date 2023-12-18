
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
            switch (t.length) {
                case 2:
                    t[1] = 0;
                case 1:
                    t[0] = -1;
                case 0:
                    return;
            }
            
            t[0] = -1;
            t[1] = 0;
            int pos = 2;
            int cnd = 0;
            while (pos < pattern.length()) {
                if (pattern.charAt(pos - 1) == pattern.charAt(cnd)) {
                    // case 1: the substring continues
                    cnd++;
                    t[pos] = cnd;
                    pos++;
                } else if (cnd > 0) {
                    // case 2: it doesn't, but we can fall back
                    cnd = t[cnd];
                } else {
                    // case 3: we have run out of candidates.  Note cnd = 0
                    t[pos] = 0;
                    pos++;
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