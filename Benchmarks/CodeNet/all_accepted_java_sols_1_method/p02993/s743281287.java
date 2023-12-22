class Main {
    public static void main(String[] args) {
        java.util.Scanner stdInputScanner = new java.util.Scanner(System.in);

        String str = stdInputScanner.next();
        String output;

        if (str.matches(".*(.)\\1.*")) {
            output = "Bad";
        } else {
            output = "Good";
        }

        System.out.println(output);
    }
}