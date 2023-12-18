public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            list.add(Integer.parseInt(scanner.next()));
        }
        Collections.sort(list);
        Collections.reverse(list);
        list.stream().limit(3).forEach(System.out::println);
    }
}