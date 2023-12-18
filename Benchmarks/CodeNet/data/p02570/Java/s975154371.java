public class Main {
    public static void main(String[] args) {
        double dist = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[2]);
        double time = Double.parseDouble(args[1]);
        if (dist / speed < time) {
            System.out.println(dist / speed);
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}