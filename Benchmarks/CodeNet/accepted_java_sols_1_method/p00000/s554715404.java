public class Main {

    public static void main(String[] a) {
        int qq = 9;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= qq; i++) {
            for (int j = 1; j <= qq; j++) {
                sb.append(i + "x" + j + "=" + i * j + "\n");
            }
        }
        System.out.print(sb.toString());
    }

}