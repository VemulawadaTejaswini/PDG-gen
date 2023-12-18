public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            for (int j = 1; i * j <= n; j++) {
                count += i * j;
            }
        }
        System.out.println(count);
    }
}
