import java.io.*;

class Main {
    private static boolean flag = true;
    private static int height;
    private static int width;

    public static void main(String[] args) {
        while (flag) {
            setData();

            if (flag) {
                writeRectangle(height, width);
            }
        }

    }

    public static void setData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] lines = reader.readLine().split(" ");
            height = Integer.parseInt(lines[0]);
            width  = Integer.parseInt(lines[1]);

            if (height == 0 && width == 0) {
                flag = false;
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writeRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}