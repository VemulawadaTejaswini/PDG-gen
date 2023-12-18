class Main {
    public static void main(String[] args) {
        String[] arguments = args[0].split(" ");
        int W = Integer.parseInt(arguments[0]);
        int H = Integer.parseInt(arguments[1]);
        int x = Integer.parseInt(arguments[2]);
        int y = Integer.parseInt(arguments[3]);
        int r = Integer.parseInt(arguments[4]);

        if ((x+r) < 0 || W < (x+r) || (y+r) < 0 || H < (y+r)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}