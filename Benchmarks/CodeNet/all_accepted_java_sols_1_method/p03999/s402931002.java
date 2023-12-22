public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int[] a = new int[] {512, 2816, 14336, 71936, 359936, 1799936, 8999936, 44999936, 224999936, 1124999936};
        char[] s = scanner.next().toCharArray();
        System.out.println(java.util.stream.IntStream.range(0, s.length).mapToLong(i -> a[s.length - i - 1] / (1 << (10 - s.length)) * (s[i] - 48L)).sum());
    }
}