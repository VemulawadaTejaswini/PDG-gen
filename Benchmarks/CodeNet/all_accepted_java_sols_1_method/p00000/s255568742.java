public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                sb.append(i);
                sb.append("x");
                sb.append(j);
                sb.append("=");
                sb.append(i * j);
                System.out.println(sb.toString());
                sb.setLength(0);
            }
        }
    }
}