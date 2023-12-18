class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();

        if (0 <= second && second < 86400) {
            /*
             * 34524 / 3600 = 9.59
             * (34524 - (3600 * 9)) / 60 = 35.4
             * (34524 - (3600 * 9)) - (35 * 60) = 24
             */
            int h = second / 3600;
            int m = (second - (h * 3600)) / 60;
            int s = (second - (h * 3600)) - (m * 60);

            System.out.println(h + ":" + m + ":" + s);
        }
    }
}
