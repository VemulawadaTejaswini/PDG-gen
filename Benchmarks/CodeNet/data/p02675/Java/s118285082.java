public class Main {
    public static void Main(String... args) {
        if (args.length != 1) {
            return;
        }
        String input = args[0];
        char lastChar = input.charAt(input.length() - 1);

        switch (lastChar) {
            case '2':
            case '4':
            case '5':
            case '7':
            case '9':
                System.out.print("hon");
                break;
            case '0':
            case '1':
            case '6':
            case '8':
                System.out.print("pon");
                break;
            case '3':
                System.out.print("bon");
                break;
            default:
                break;
        }
    }
}
