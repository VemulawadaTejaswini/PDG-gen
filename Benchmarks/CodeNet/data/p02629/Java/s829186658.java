public class One_Quadrillion_and_One_Dalmatians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        String ans = "";
        while (N > 0) {
            N--;
            ans = (char)(N % 26 + 97) + ans;
            N /= 26;
        }
        System.out.println(ans);
    }
}