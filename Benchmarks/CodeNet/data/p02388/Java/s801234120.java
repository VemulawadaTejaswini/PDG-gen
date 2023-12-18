public class Main {

    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
            int retNum = num * num * num;
            System.out.println(retNum);
        } catch (NumberFormatException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}