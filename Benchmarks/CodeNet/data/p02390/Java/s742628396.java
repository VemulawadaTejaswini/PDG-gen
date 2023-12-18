class Main {
   public static void main(String[] args) {
        String input = args[0];
        int S = Integer.parseInt(input);
        int h = S / 3600;
        int m = S % 3600 / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
   }
}