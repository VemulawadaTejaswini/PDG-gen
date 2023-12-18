import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (var input = System.in) {
            var degree = Integer.parseInt(new String(input.readAllBytes()));
            var roomTemperature = new RoomTemperature(degree);
            if (roomTemperature.isTooHot()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {

        }
    }

    public static class RoomTemperature {
        private final int degree;
        public RoomTemperature(int degree) {
            this.degree = degree;
        }
        public boolean isTooHot() {
            if (degree >= 30) {
                return true;
            } else {
                return false;
            }
        }
    }
}