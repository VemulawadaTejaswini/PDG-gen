class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        if (1 <= a && a <= 10)
        System.out.println(a*a*a + a*a + a);
    }
}