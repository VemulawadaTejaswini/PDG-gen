public class STNS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputNums;
        while (true) {
            inputNums = scan.nextLine();
            if ("0 0".equals(inputNums)) {
                break;
            }
            System.out.println(compNumers(inputNums));
        }
    }
    private static String compNumers(String inputNums) {
        String space = " ";
        String nums[] = inputNums.split(space);
        long x = Long.parseLong(nums[0]);
        long y = Long.parseLong(nums[1]);
        if (x > y) {
            return (y + space + x);
        }
        return (x + space + y);
    }
}
