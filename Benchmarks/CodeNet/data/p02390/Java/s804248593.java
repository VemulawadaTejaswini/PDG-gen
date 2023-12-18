public class Main {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int minutes = i / 60;
        int second = i % 60;
        int minute = minutes % 60;
        int hour = minutes / 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}