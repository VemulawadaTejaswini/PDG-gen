public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[]$) {
        int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt(), k = scanner.nextInt();
        long[] a = java.util.stream.IntStream.range(0, x).mapToObj(i -> scanner.nextLong()).sorted(java.util.Comparator.reverseOrder()).mapToLong(Long::longValue).toArray();
        long[] b = java.util.stream.IntStream.range(0, y).mapToObj(i -> scanner.nextLong()).sorted(java.util.Comparator.reverseOrder()).mapToLong(Long::longValue).toArray();
        long[] c = java.util.stream.IntStream.range(0, z).mapToObj(i -> scanner.nextLong()).sorted(java.util.Comparator.reverseOrder()).mapToLong(Long::longValue).toArray();
        java.util.stream.IntStream.rangeClosed(1, x).boxed().flatMap(i -> java.util.stream.IntStream.rangeClosed(1, y).boxed().flatMap(j -> {
            java.util.List<Long> list = new java.util.ArrayList<>();
            int l = 1;
            while (i * j * l <= k && l <= z) list.add(a[i - 1] + b[j - 1] + c[l++ - 1]);
            return list.stream();
        })).sorted(java.util.Comparator.reverseOrder()).limit(k).forEach(System.out::println);
    }
}