
public class Main {
    public static void main(String[] args) {
        String seedStr= args[0];
        Integer seed = Integer.valueOf(seedStr);
        System.out.println((int) Math.pow(seed.doubleValue(), 3.0));
    }
}