public class Main {
    public static void main(String[] args) throws Exception {
        calc(Integer.parseInt(args[1]));
    }

    public static int calc(int a){
        return a + a*a + a*a*a;
    }
}
