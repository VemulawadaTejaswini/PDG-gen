public class Main {

    public static void main(String[] args) throws Exception {
        var inputText = AtCoderReader.readInputText();
        var degree = Integer.parseInt(inputText);
        var roomTemperature = new RoomTemperature(degree);
        if (roomTemperature.isTooHot()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
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

    public static class AtCoderReader {
        public static String readInputText() {
            try (var input = System.in) {
                return new String(System.in.readAllBytes()).trim();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}