class main {
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[0]);

        Integer d = a / b;
        Integer r = a % b;
        Float f = Float.parseFloat(args[0]) / Float.parseFloat(args[1]);

        System.out.println( String.format("%d %d %04f", d, r, f));
        return 0;
    }
}