public class Main {

    public static void main(String[] args) throws Exception {
        var input = new String(System.in.readAllBytes());
        var roomTemperature = Integer.parseInt(input);
        var airConditioner = new AirConditioner();
        if (airConditioner.isTooHot(roomTemperature)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static class AirConditioner {
        public boolean isTooHot(int roomTemperature) {
            if (roomTemperature >= 30) {
                return true;
            } else {
                return false;
            }
        }
    }
}