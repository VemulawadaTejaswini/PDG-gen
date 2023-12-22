//Semicolon-less Java
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        try(java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            for (java.util.Map<String, Integer> val : new java.util.Map[]{new java.util.HashMap<>()}) {
                if (val.put("h", 1) == null) {}
                if (val.put("w", 1) == null) {}

                while (val.get("h") != 0 && val.get("w") != 0) {
                    if (val.put("h", scanner.nextInt()) == null) {}
                    if (val.put("w", scanner.nextInt()) == null) {}

                    if (val.get("h") != 0 && val.get("w") != 0) {
                        if (java.util.stream.IntStream
                                .range(0, val.get("h")).boxed().map(i -> java.util.stream.IntStream.range(0, val.get("w")).boxed().map(k -> "#").collect(java.util.stream.Collectors.joining())).peek(System.out::println)
                                .count() == 0) {}
                        if (java.util.stream.IntStream.range(0, 1).boxed().map(i -> "").peek(System.out::println).count() == 0){}
                    }

                }

            }
        }

    }
}