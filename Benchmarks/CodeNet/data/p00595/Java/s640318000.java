
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = br.readLine();
            System.out.println(getCubicOf(line));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param line
     *            ??´??°x?????\???
     * @return x???3???
     */
    private static long getCubicOf(String line) {
        long x = Long.parseLong(line);
        return (long)Math.pow(x, 3);
    }
}