public class XCubic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputIum = scan.nextInt();
        System.out.println(calCubic(inputIum));
    }
    private static long calCubic (int inputIum) {
        return inputIum * inputIum * inputIum;
    }
}