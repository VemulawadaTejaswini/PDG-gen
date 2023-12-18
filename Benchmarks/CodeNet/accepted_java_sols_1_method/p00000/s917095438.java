
class Main {

    public static void main(String[] args) {
        int a = 1;
        while (a < 10) {
            for (int b = 1; b < 10; b++) {
                System.out.println(a + "x" + b + "=" + (a * b));
            }
            a++;
        }
    }

}

