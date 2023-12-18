public class Main {

    public static void main(String... args) throws Exception {
        var inputText = AtCoderReader.readInputText();
        var k = Integer.parseInt(inputText);

        if (k % 2 == 0) {
            System.out.println(-1);
            return;
        } else if (k % 5 == 0) {
            System.out.println(-1);
            return;
        }

        int L;
        if (k % 7 == 0) {
            L = 9 * k / 7;
        } else {
            L = 9 * k;
        }

        int mod = 1;
        for (int i = 1; true; i++) {
            mod = (10 * mod) % L;
            if (mod == 1) {
                System.out.println(i);
                return;
            }
        }
    }

    public static class AtCoderReader {
        public static String readInputText() {
            try (var input = System.in) {
                return new String(System.in.readAllBytes()).trim();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}